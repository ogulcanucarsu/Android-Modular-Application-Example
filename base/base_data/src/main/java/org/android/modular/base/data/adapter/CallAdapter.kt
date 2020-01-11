package org.android.modular.base.data.adapter

import kotlinx.coroutines.Deferred
import org.android.modular.base.data.api.ApiResponse
import org.android.modular.base.data.model.DataHolder

interface CallAdapter<T : Any> {
    suspend fun adapt(apiCall: Deferred<ApiResponse<T?>>): DataHolder<T>
}
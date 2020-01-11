package org.android.modular.base.data.adapter

import kotlinx.coroutines.Deferred
import org.android.modular.base.data.api.ApiResponse
import org.android.modular.base.data.error.ErrorFactory
import org.android.modular.base.data.model.DataHolder
import javax.inject.Inject

class ApiCallAdapter<T : Any> @Inject constructor(private val errorFactory: ErrorFactory) :
    CallAdapter<T> {

   override suspend fun adapt(apiCall: Deferred<ApiResponse<T?>>): DataHolder<T> {
        val apiResult = apiCall.await()

        if (apiResult.data == null) {
            return DataHolder.Fail(errorFactory.createInvalidResponseError())
        }
        return DataHolder.Success(apiResult.data)
    }
}
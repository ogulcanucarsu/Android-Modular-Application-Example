package org.android.modular.base.data.datasource

import android.support.annotation.CallSuper
import org.android.modular.base.data.coroutines.AsyncManager
import org.android.modular.base.data.coroutines.DefaultAsyncManager
import org.android.modular.base.data.model.BaseRepository

abstract class BaseRepositoryImpl(protected val asyncManager: AsyncManager = DefaultAsyncManager()) : BaseRepository,
    AsyncManager by asyncManager {

    @CallSuper
    override fun dropRepo() {
        asyncManager.destroy()
    }
}
package org.android.modular.base.domain

import org.android.modular.base.data.coroutines.AsyncManager
import org.android.modular.base.data.coroutines.DefaultAsyncManager


abstract class BaseInteractor constructor(
    private val asyncManager: AsyncManager = DefaultAsyncManager()
) : AsyncManager by asyncManager {
    open fun destroyInteractor() {
        asyncManager.destroy()
    }
}
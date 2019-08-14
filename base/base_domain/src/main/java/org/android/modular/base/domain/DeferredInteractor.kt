package org.android.modular.base.domain

import kotlinx.coroutines.Deferred
import org.android.modular.base.data.model.DataHolder

interface Interactor {

    interface DeferredInteractor<params : Params, T : Any> : Interactor {
        suspend fun execute(postParams: params): Deferred<DataHolder<T>>
    }

    interface DeferredRetrieveInteractor<T : Any> : Interactor {
        suspend fun execute(): Deferred<DataHolder<T>>
    }

    interface SingleInteractor<params : Params, T : Any> : Interactor {
        fun execute(params: params): T?
    }

    interface SingleRetrieveInteractor<T : Any?> {
        fun execute(): T?
    }

    abstract class Params {
        // marker class
    }
}
package org.android.modular.base.data.model

import org.android.modular.base.data.error.Error

sealed class DataHolder<out T : Any> {

    data class Success<out T : Any>(val data: T) : DataHolder<T>()

    data class Fail(val e: Error) : DataHolder<Nothing>()

    data class Loading<out T : Any>(val data: T? = null) : DataHolder<T>()
}
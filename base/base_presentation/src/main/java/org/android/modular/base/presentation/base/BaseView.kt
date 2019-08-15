package org.android.modular.base.presentation.base

import org.android.modular.base.data.error.Error

interface BaseView {
    fun onError(error: Error)
}
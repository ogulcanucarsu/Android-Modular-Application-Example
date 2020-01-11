package org.android.modular.base.presentation.extensions

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import org.android.modular.base.data.model.DataHolder
import org.android.modular.base.presentation.base.BaseView

inline fun <T : Any> LiveData<DataHolder<T>>.observeApi(
    lifecycleOwner: LifecycleOwner,
    crossinline body: (DataHolder<T>?) -> Unit
) {
    observe(lifecycleOwner, Observer { bean: DataHolder<T>? ->
        if (bean is DataHolder.Fail) {
            if (lifecycleOwner is BaseView) {
                lifecycleOwner.onError(bean.e)
            }
        }
        body(bean)
    })
}
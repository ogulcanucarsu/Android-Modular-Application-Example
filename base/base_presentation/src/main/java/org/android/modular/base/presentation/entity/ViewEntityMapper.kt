package org.android.modular.base.presentation.entity

interface ViewEntityMapper<R : Any, T : ViewEntity> {
    fun map(value: R): T
}

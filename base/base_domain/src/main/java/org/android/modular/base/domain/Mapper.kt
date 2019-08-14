package org.android.modular.base.domain

interface Mapper<in T, out R> {
    fun map(input: T): R
}

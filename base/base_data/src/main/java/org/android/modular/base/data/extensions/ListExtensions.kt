package org.android.modular.base.data.extensions

/*
 * Gets intex with safe way
 */
fun <T> List<T>?.safeGet(i: Int): T? {
    return try {
        if (this == null) {
            return null
        }
        return this[i]
    } catch (e: IndexOutOfBoundsException) {
        null
    }
}
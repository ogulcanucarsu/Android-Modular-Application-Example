package org.android.modular.base.data.extensions

import android.content.Context
import kotlin.math.abs
import kotlin.math.log10

private const val DECIMAL_BASE = 10.0
const val ZERO = 0

/*
 * Converts dp to px
 */
fun Int.toPx(context: Context): Int = (this * context.resources.displayMetrics.density).toInt()

/*
 * Converts pixel to dp
 */
fun Int.toDp(context: Context): Int = (this / context.resources.displayMetrics.density).toInt()

/*
 * Gets length of integer
 */
inline val Int.length: Int
    get() {
        return when (this) {
            ZERO -> 1
            else -> log10(abs(toDouble())).toInt() + 1
        }
    }

/*
 * Checks last digit
 */
fun Int.lastNDigit(count: Int): Int {
    return this % Math.pow(DECIMAL_BASE, count.toDouble()).toInt()
}

/*
 * Checks starts with
 */
fun Int.startsWith(number: Int): Boolean {
    return toString().startsWith(number.toString())
}

fun Int.isPositive(): Boolean = this > 0
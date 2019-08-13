package org.android.modular.base.data.error

import com.google.gson.annotations.SerializedName

data class StatusError(@SerializedName("code") val code: String?, @SerializedName("message") val message: String?)
package org.android.modular.base.data.api

import com.google.gson.annotations.SerializedName

data class ApiResponse<T>(
    //Api response
    @SerializedName("data")
    val data : T?
)
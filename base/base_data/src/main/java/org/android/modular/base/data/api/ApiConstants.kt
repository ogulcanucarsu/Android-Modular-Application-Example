package org.android.modular.base.data.api

class ApiConstants private constructor() {

    /*
     Api Information
    */
    companion object {
        //Api time-out
        const val TIMEOUT_IN_MILIS = 60000L

        //End-Point-Type
        const val ENDPOINT_TYPE = "end.point.type"

        //data format
        const val FORMAT = "json"
    }

    enum class EndPoint {
        //System, may decrease or increase
        ENDPOINT_PROD,
        ENDPOINT_PREPROD,
        ENDPOINT_TEST,
        ENDPOINT_DEV,
    }
}
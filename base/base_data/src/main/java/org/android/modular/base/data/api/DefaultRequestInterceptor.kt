package org.android.modular.base.data.api

import okhttp3.Interceptor
import okhttp3.Response
import org.android.modular.base.data.BuildConfig
import javax.inject.Inject

class DefaultRequestInterceptor @Inject constructor() : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(with(chain.request().newBuilder()) {
            addHeader("Content-Type", "application/json")
            addHeader("VersionCode", BuildConfig.VERSION_CODE.toString())
            addHeader("VersionName", BuildConfig.VERSION_NAME)
            addHeader("ApplicationId", BuildConfig.APPLICATION_ID)
            build()
        })
    }
}
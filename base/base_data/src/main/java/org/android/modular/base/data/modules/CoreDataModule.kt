package org.android.modular.base.data.modules

import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Deferred
import org.android.modular.base.data.adapter.ApiCallAdapter
import org.android.modular.base.data.adapter.CallAdapter
import org.android.modular.base.data.api.ApiResponse
import org.android.modular.base.data.error.ErrorFactory
import javax.inject.Singleton

@Module(includes = [ApiModule::class])
class CoreDataModule {

    @Singleton
    @Provides
    fun provideApiCallAdapter(errorFactory: ErrorFactory): CallAdapter<Deferred<ApiResponse<out Any?>>> =
        ApiCallAdapter(errorFactory)
}
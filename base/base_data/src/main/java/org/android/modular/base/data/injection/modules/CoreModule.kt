package org.android.modular.base.data.injection.modules

import dagger.Module
import dagger.Provides
import org.android.modular.base.data.error.DefaultErrorFactory
import org.android.modular.base.data.error.ErrorFactory
import org.android.modular.base.data.preconditions.AndroidPreconditions
import org.android.modular.base.data.preconditions.DefaultAndroidPreconditions
import javax.inject.Singleton

@Module
class CoreModule {

    @Provides
    @Singleton
    internal fun provideErrorFactory(): ErrorFactory = DefaultErrorFactory()

}
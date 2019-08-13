package org.android.modular.base.data.injection.modules

import dagger.Module
import dagger.Provides
import org.android.modular.base.data.preconditions.AndroidPreconditions
import org.android.modular.base.data.preconditions.DefaultAndroidPreconditions
import javax.inject.Singleton

@Module(
    includes = [CoroutineManagerModule::class,
        CoroutineDispatcherModule::class,
        ErrorFactoryModule::class]
)
class CoreModule {

    @Provides
    @Singleton
    fun provideAndroidPreconditions(): AndroidPreconditions = DefaultAndroidPreconditions()

}
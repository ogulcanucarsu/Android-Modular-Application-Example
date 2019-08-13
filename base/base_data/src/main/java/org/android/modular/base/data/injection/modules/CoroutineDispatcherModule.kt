package org.android.modular.base.data.injection.modules

import dagger.Module
import dagger.Provides
import org.android.modular.base.data.coroutines.DefaultDispatcherProvider
import org.android.modular.base.data.coroutines.DispatcherProvider
import javax.inject.Singleton

/*
 * Provides default coroutine dispatcher provider.
 */
@Module
class CoroutineDispatcherModule {
    @Provides
    @Singleton
    fun provideDefaultDispatcher(): DispatcherProvider = DefaultDispatcherProvider
}
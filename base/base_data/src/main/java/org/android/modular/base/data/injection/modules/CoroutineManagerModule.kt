package org.android.modular.base.data.injection.modules


import org.android.modular.base.data.coroutines.*
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class CoroutineManagerModule {

    @Provides
    @Named(AM_NAME_INTERACTOR)
    fun provideAsyncManagerForInteractors(dispatcherProvider: DispatcherProvider): AsyncManager =
        DefaultAsyncManager(dispatcherProvider.default())

    @Provides
    @Named(AM_NAME_REPOSITORY)
    fun provideAsyncManagerForRepositories(dispatcherProvider: DispatcherProvider): AsyncManager =
        DefaultAsyncManager(dispatcherProvider.io())

    @Provides
    @Named(AM_NAME_REMOTE_DATA_SOURCE)
    fun provideAsyncManagerForRemoteDataSources(dispatcherProvider: DispatcherProvider): AsyncManager =
        DefaultAsyncManager(dispatcherProvider.io())

    @Provides
    @Named(AM_NAME_LOCAL_DATA_SOURCE)
    fun provideAsyncManagerForLocalDataSources(dispatcherProvider: DispatcherProvider): AsyncManager =
        DefaultAsyncManager(dispatcherProvider.io())

    @Provides
    @Named(CM_VIEWMODEL)
    fun provideCoroutineManagerForViewModel(dispatcherProvider: DispatcherProvider): CoroutineManager =
        DefaultCoroutinesManager(dispatcherProvider.ui())

    companion object {
        const val AM_NAME_INTERACTOR = "am_interactor"
        const val AM_NAME_REPOSITORY = "am_repository"
        const val CM_VIEWMODEL = "cm_viewmodel"
        const val AM_NAME_REMOTE_DATA_SOURCE = "am_remote_datasource"
        const val AM_NAME_LOCAL_DATA_SOURCE = "am_local_datasource"
    }
}
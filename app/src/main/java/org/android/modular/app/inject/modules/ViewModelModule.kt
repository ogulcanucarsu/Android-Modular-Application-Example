package org.android.modular.app.inject.modules

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import org.android.modular.base.presentation.viewmodel.VmFactory

@Module
internal abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(vmFactory: VmFactory): ViewModelProvider.Factory
}
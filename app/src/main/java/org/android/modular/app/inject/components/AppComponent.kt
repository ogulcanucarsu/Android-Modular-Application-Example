package org.android.modular.app.inject.components

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import org.android.modular.app.ModularApp
import org.android.modular.app.inject.modules.ApplicationModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AndroidInjectionModule::class,
        ApplicationModule::class
    ]
)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: ModularApp): AppComponent
    }

    fun inject(application: ModularApp)
}

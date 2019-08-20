package org.android.modular.app.inject.components

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import org.android.modular.app.ModularApp
import org.android.modular.app.inject.modules.ApplicationModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        ApplicationModule::class
    ]
)
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: ModularApp): Builder

        fun build(): AppComponent
    }

    fun inject(application: ModularApp)
}

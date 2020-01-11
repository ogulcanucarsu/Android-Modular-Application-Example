package org.android.modular.app.inject.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import org.android.modular.app.ui.SplashActivity
import org.android.modular.base.data.injection.scope.ActivityScope


@Module
internal abstract class ActivityModule {
    @ContributesAndroidInjector
    @ActivityScope
    abstract fun contributeMainActivityInjector(): SplashActivity
}
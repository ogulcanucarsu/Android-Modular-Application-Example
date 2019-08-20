package org.android.modular.app

import android.app.Activity
import android.app.Application
import android.content.Context
import dagger.android.*
import org.android.modular.app.inject.components.DaggerAppComponent
import java.lang.ref.WeakReference
import javax.inject.Inject

class ModularApp : Application(), HasActivityInjector{

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        currentContext = WeakReference(this)
        inject()
        goOn()
    }

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector

    private fun inject(){
        DaggerAppComponent.factory()
            .create(this)
            .inject(this)
    }

    private fun goOn() {
       //no-op
    }


    companion object {
        var currentContext: WeakReference<Context>? = null
    }
}
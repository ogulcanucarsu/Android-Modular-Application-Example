package org.android.modular.app

import android.app.Activity
import android.app.Application
import android.app.Service
import android.content.BroadcastReceiver
import android.content.Context
import dagger.android.*
import org.android.modular.app.inject.components.DaggerAppComponent
import java.lang.ref.WeakReference
import javax.inject.Inject

class ModularApp : Application(), HasActivityInjector,
    HasBroadcastReceiverInjector,
    HasServiceInjector{

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    @Inject
    lateinit var dispatchingServiceInjector: DispatchingAndroidInjector<Service>

    @Inject
    lateinit var dispatchingBroadcastReceiverInjector: DispatchingAndroidInjector<BroadcastReceiver>


    override fun onCreate() {
        super.onCreate()
        currentContext = WeakReference(this)
        inject()
        goOn()
    }

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector

    override fun serviceInjector(): AndroidInjector<Service> = dispatchingServiceInjector

    override fun broadcastReceiverInjector(): AndroidInjector<BroadcastReceiver> = dispatchingBroadcastReceiverInjector

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
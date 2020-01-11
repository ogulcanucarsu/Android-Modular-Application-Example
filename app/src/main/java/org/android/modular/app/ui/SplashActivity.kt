package org.android.modular.app.ui

import android.os.Bundle
import android.os.Handler
import org.android.modular.app.R
import org.android.modular.app.base.navigation.navigations.DefaultNavigationController
import org.android.modular.app.base.navigation.navigations.NavigationController
import org.android.modular.base.presentation.base.BaseActivity
import java.lang.ref.WeakReference

class SplashActivity : BaseActivity() {

    private lateinit var navigationController: NavigationController

    override fun getLayoutRes(): Int = R.layout.activity_splash

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.navigationController = DefaultNavigationController(WeakReference(this))

        Handler().postDelayed({
            //navigate to your DashBoard or other activity
        }, SPLASH_DELAY_TIME)

    }

    companion object {
        const val SPLASH_DELAY_TIME = 500L
    }
}

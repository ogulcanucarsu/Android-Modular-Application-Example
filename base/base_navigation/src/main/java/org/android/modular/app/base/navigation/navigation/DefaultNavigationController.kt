package org.android.modular.app.base.navigation.navigation

import androidx.fragment.app.FragmentActivity
import org.android.modular.app.base.navigation.features.Splash
import java.lang.ref.WeakReference

class DefaultNavigationController constructor(
    override val activity: WeakReference<FragmentActivity>
) : NavigationController {
    override fun navigateToSplash(){
        startActivity(Splash.dynamicStart)
    }
}
package org.android.modular.app.base.navigation.features

import android.content.Intent
import org.android.modular.app.base.navigation.loadIntentOrReturnNull


object Splash : Feature<Intent> {

    private const val SPLASH = "org.android.modular.app.ui.SplashActivity"

    override val dynamicStart: Intent?
        get() = SPLASH.loadIntentOrReturnNull()

}

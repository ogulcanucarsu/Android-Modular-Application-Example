package org.android.modular.app.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.android.modular.app.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
}

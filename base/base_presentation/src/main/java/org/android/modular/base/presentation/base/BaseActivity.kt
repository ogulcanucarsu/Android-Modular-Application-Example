package org.android.modular.base.presentation.base

import android.content.res.Resources
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.annotation.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import org.android.modular.base.presentation.Constants
import org.android.modular.base.presentation.R
import org.android.modular.base.presentation.navigation.UiNavigation

abstract class BaseActivity : AppCompatActivity() {

    @LayoutRes
    abstract fun getLayoutRes(): Int

    @StringRes
    open val titleRes = R.string.app_name

    @MenuRes
    open val menuRes = Constants.NO_RES

    @IdRes
    open val toolbarId = Constants.NO_RES

    open val uiNavigation = UiNavigation.BACK

    open val shouldOnBackPressedWork = true

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutRes())
        initToolBar()
        initNavigation(uiNavigation)
        setScreenTitle(getString(titleRes))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        if (menuRes != Constants.NO_RES) {
            menuInflater.inflate(menuRes, menu)
            return true
        }
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        if (shouldOnBackPressedWork) {
            super.onBackPressed()
        }
    }

    fun setScreenTitle(@StringRes titleRes: Int) {
        var title: String? = null
        try {
            title = getString(titleRes)
        } catch (e: Resources.NotFoundException) {
            // no-op
        }
        setScreenTitle(title)
    }

    fun setScreenTitle(title: String?) {
        supportActionBar?.title = title ?: getString(R.string.app_name)
    }

    fun setToolbar(toolbar: Toolbar) {
        setSupportActionBar(toolbar)
    }

    fun initNavigation(uiNavigation: UiNavigation) {
        when (uiNavigation) {
            UiNavigation.BACK -> {
                supportActionBar?.setDisplayHomeAsUpEnabled(true)
            }
            UiNavigation.ROOT -> {
                supportActionBar?.setDisplayHomeAsUpEnabled(false)
            }
            UiNavigation.NONE -> {
                supportActionBar?.setDisplayHomeAsUpEnabled(false)
            }
            else -> {
                supportActionBar?.setDisplayHomeAsUpEnabled(true)
            }
        }
    }

    private fun initToolBar() {
        if (toolbarId == Constants.NO_RES) return
        findViewById<Toolbar>(toolbarId)?.let {
            setToolbar(it)
        }
    }
}
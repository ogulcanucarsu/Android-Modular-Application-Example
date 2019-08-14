package org.android.modular.base.presentation.application

import dagger.android.HasActivityInjector
import dagger.android.HasBroadcastReceiverInjector
import dagger.android.HasServiceInjector
import org.android.modular.base.data.injection.Injectable


interface CoreApplication : Injectable, HasActivityInjector, HasBroadcastReceiverInjector, HasServiceInjector
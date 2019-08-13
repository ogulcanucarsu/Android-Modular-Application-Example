object BaseLibraries {
    const val appCompat = "com.android.support:appcompat-v7:${Versions.appCompat}"
    const val constraitLayout = "com.android.support.constraint:constraint-layout:${Versions.constraitLayout}"
    const val recyclerView = "com.android.support:recyclerview-v7:${Versions.recyclerView}"
}

object TestLibraries {
    const val testRunner = "com.android.support.test:runner:${Versions.testRunner}"
    const val espresso = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
    const val junit = "junit:junit:${Versions.junit}"
}

object HelperLibraries {
    const val lottie = "com.airbnb.android:lottie:${Versions.lottieVersion}"
    const val easyFlipViewPager =
        "com.wajahatkarim3.easyflipviewpager:easyflipviewpager:${Versions.easyFlipViewViewPager}"

}

object CoreLibraries {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlinVersion}"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesVersion}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"
    const val dagger2AndroidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger2Version}"
    const val gson = "com.squareup.retrofit2:converter-gson:${Versions.gsonVersion}"
    const val logInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttpLoggingInterceptorVersion}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttpVersion}"
    const val retrofitCoroutineAdapter =
        "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofitCoroutineAdapterVersion}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
}
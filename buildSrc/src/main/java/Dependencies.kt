object BaseLibraries {
    const val appCompat = "androidx.appcompat:appcompat:${Versions.xVersion}"
    const val constraitLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraitLayout}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.xVersion}"
    const val supportDesign = "com.google.android.material:material:${Versions.xVersion}"
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

    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.archVersion}"
    const val lifecycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.archVersion}"

}

object CoreLibraries {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlinVersion}"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesVersion}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"
    const val dagger2AndroidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger2Version}"
    const val dagger2Compiler = "com.google.dagger:dagger-compiler:${Versions.dagger2Version}"
    const val gson = "com.squareup.retrofit2:converter-gson:${Versions.gsonVersion}"
    const val logInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttpLoggingInterceptorVersion}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttpVersion}"
    const val retrofitCoroutineAdapter =
        "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofitCoroutineAdapterVersion}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val javaxAnnotation = "org.glassfish:javax.annotation:${Versions.javaxAnnotationVersion}"
    const val dagger2AndroidProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger2Version}"

}
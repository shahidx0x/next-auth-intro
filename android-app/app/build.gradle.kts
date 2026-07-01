plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.shahidx0x.androidapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.shahidx0x.androidapp"
        minSdk = 21
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }
}

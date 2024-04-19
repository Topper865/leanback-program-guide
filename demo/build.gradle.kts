plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    compileSdk =  33
    namespace = "com.egeniq.programguide"
    defaultConfig {
        applicationId =  "com.egeniq.programguide"
        minSdk = 21
        targetSdk =  33
        versionCode =  1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(project(":library"))

    implementation(libs.androidx.leanback)
    implementation(libs.androidx.appcompat)

    implementation(libs.rxandroid)
    implementation(libs.rxjava)

    implementation(libs.glide)
}

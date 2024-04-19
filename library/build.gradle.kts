plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.kotlinParcelize)
}

android {
    compileSdk= 33
    namespace = "com.egeniq.androidtvprogramguide"
    defaultConfig {
        minSdk= 21
        targetSdk= 33
    }

    compileOptions {
        sourceCompatibility =  JavaVersion.VERSION_17
        targetCompatibility =  JavaVersion.VERSION_17
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

    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.leanback)

    implementation(libs.androidx.constraintlayout)

    implementation(libs.glide)
    api(libs.threetenabp)
}

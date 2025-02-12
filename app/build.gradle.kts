plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
}

android {
    namespace = "com.linuxh2o.aura"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.linuxh2o.aura"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            versionNameSuffix = "-prod"
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        debug {
            isMinifyEnabled = false
            versionNameSuffix = "-dbg"
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }

    ksp {
        arg("room.schemaLocation", "$projectDir/schemas") // Path for schema files
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // DI
    implementation(libs.hilt.android)
    ksp(libs.hilt.android.compiler)
    implementation(libs.androidx.hilt.navigation.compose) // For Navigation
    implementation(libs.androidx.hilt.work) // For WorkManager
    ksp(libs.androidx.hilt.compiler) // For Kotlin

    // Lifecycle-aware components
    implementation(libs.androidx.lifecycle.viewmodel.ktx) // ViewModel
    implementation(libs.androidx.lifecycle.viewmodel.compose) // ViewModel utilities for Compose
    ksp(libs.androidx.lifecycle.compiler) // Annotation processor

    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    implementation(libs.logging.interceptor)

    // Kotlin Coroutine + Android + Serialization
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.serialization.json)

    // WorkManager + DataStore
    implementation(libs.androidx.work.runtime.ktx)  // Kotlin + coroutines
    implementation(libs.androidx.datastore.preferences)

    // Miscellaneous
    implementation(libs.coil.compose)
    implementation(libs.androidx.core.splashscreen)
    implementation(libs.androidx.navigation.compose)

    // Room DB
    implementation(libs.androidx.room.runtime)
    annotationProcessor(libs.androidx.room.room.compiler)
    ksp(libs.androidx.room.room.compiler) // Annotation processing
    implementation(libs.androidx.room.ktx) // optional - Kotlin extension + Coroutine support
}
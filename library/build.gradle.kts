plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    codeChecks
}

android {
    namespace = "dev.caiofaustino.library"
    compileSdk = 32

    defaultConfig {
        minSdk = 21
        targetSdk = 32

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(libs.core.ktx)
    implementation(libs.lifecycle.runtime.ktx)

    testImplementation(testLibs.junit)
    androidTestImplementation(instrumentedTestLibs.junit.ext)
    androidTestImplementation(instrumentedTestLibs.espresso)
    androidTestImplementation(instrumentedTestLibs.compose.junit4)
}

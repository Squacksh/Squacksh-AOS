plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = AppConfig.appNameSpace
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        minSdk = AppConfig.minSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(project(":domain"))

    Dependencies.KTX.run {
        implementation(CORE)
    }

    Dependencies.AndroidX.run {
        implementation(APP_COMPAT)
        implementation(CONSTRAINT_LAYOUT)
        implementation(MATERIAL)
    }

    Dependencies.Test.run {
        implementation(JUNIT)
        androidTestImplementation(ANDROID_TEST)
        androidTestImplementation(ESPRESSO)
    }
}
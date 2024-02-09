object Dependencies {
    object KTX {
        const val CORE = "androidx.core:core-ktx:${Versions.CORE_KTX}"
    }

    object AndroidX {
        const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"
        const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
        const val CONSTRAINT_LAYOUT =
            "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
    }

    object Test {
        const val JUNIT = "junit:junit:${Versions.JUNIT}"
        const val ANDROID_TEST = "androidx.test.ext:junit:${Versions.ANDROID_TEST}"
        const val ESPRESSO = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO}"
    }
}
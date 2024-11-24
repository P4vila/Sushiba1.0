plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.sushiba"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.sushiba"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation ("com.google.android.material:material:1.8.0")
    implementation ("com.google.android.material:material:1.9.0") // Para TabLayout
    implementation ("androidx.viewpager2:viewpager2:1.0.0") // Para ViewPager2





    // Agregar Glide con la sintaxis correcta en Kotlin DSL
    implementation("com.github.bumptech.glide:glide:4.15.1")
    annotationProcessor("com.github.bumptech.glide:compiler:4.15.1") // Opcional pero recomendable

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)




}





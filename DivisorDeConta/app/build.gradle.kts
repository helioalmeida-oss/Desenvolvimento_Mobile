plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    // Plugin do compilador do Jetpack Compose (obrigatorio a partir do Kotlin 2.0).
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    namespace = "com.example.divisordeconta"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.divisordeconta"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
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

    // Habilita a construcao da tela com Jetpack Compose.
    buildFeatures {
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.activity:activity-compose:1.9.3")

    // O BOM alinha automaticamente as versoes das bibliotecas do Compose.
    implementation(platform("androidx.compose:compose-bom:2024.10.01"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
}

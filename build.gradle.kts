buildscript {
    val kotlinVersion by extra("1.4.31")
    val navVersion by extra("2.3.5")
    val hiltVersion = "+"
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.2")
        classpath(kotlin("gradle-plugin", kotlinVersion))
        classpath("com.google.dagger:hilt-android-gradle-plugin:$hiltVersion")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$navVersion")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
}
tasks {
    @Suppress("UNUSED_VARIABLE")
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}

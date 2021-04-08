buildscript {
    val kotlinVersion = "1.4.21"
    val hiltVersion = "+"
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.2")
        classpath(kotlin("gradle-plugin", kotlinVersion))
        classpath ("com.google.dagger:hilt-android-gradle-plugin:$hiltVersion")
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

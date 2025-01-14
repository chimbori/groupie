buildscript {
  repositories {
    google()
    mavenCentral()
    maven("https://jitpack.io")
  }
  dependencies {
    classpath(libs.android.gradle.plugin)
    classpath(libs.kotlin.plugin)
    classpath(libs.jetbrains.dokka.plugin)
    // NOTE: Do not place your application dependencies here; they belong
    // in the individual module build.gradle files
  }
}

allprojects {
  repositories {
    google()
    mavenCentral()
    maven("https://jitpack.io")
  }
}

tasks.register<Delete>("clean").configure {
  delete(rootProject.layout.buildDirectory)
}

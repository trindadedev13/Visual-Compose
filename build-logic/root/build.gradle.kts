import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins { 
  `kotlin-dsl`
}

repositories {
  gradlePluginPortal()
  google()
  mavenCentral()
}

tasks.withType<KotlinCompile>().configureEach {
  compilerOptions {
    jvmTarget.set(JvmTarget.JVM_21) 
  }
}

dependencies {
  implementation(project(":common")) 
}
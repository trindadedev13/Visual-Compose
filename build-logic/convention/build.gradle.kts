plugins {
  `kotlin-dsl`
}

dependencies {
  compileOnly(libs.android.gradle)
  compileOnly(libs.compose.gradle)
  compileOnly(libs.kotlin.gradle)
  compileOnly(libs.ksp.gradle)
}

gradlePlugin {
  plugins {
    register("template.application") {
      id = "template.application"
      implementationClass = "ApplicationConventionPlugin"
    }
    
    register("template.library") {
      id = "template.library"
      implementationClass = "LibraryConventionPlugin"
    }
    
    register("template.compose") {
      id = "template.compose"
      implementationClass = "ComposeConventionPlugin"
    }
  }
}
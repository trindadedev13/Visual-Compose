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
    register("visualcompose.application") {
      id = "visualcompose.application"
      implementationClass = "ApplicationConventionPlugin"
    }
    
    register("visualcompose.library") {
      id = "visualcompose.library"
      implementationClass = "LibraryConventionPlugin"
    }
    
    register("visualcompose.compose") {
      id = "visualcompose.compose"
      implementationClass = "ComposeConventionPlugin"
    }
  }
}
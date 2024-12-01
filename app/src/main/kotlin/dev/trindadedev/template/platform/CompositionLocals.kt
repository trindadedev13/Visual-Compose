package dev.trindadedev.template.platform

import androidx.compose.runtime.compositionLocalOf
import androidx.navigation.NavHostController

val LocalMainNavController = compositionLocalOf<NavHostController> {
  noLocalProvidedFor("LocalMainNavController")
}

internal fun noLocalProvidedFor(name: String): Nothing {
  error("CompositionLocal $name not present")
}

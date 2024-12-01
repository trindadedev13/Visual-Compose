package dev.trindadedev.visualcompose.navigation

import android.util.Log

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute

import dev.trindadedev.visualcompose.navigation.routes.HomeRoute
import dev.trindadedev.visualcompose.platform.LocalMainNavController
import dev.trindadedev.visualcompose.ui.animations.navigation.NavigationAnimationTransitions
import dev.trindadedev.visualcompose.ui.screens.home.HomeScreen

import kotlin.reflect.typeOf

@Composable
fun MainNavHost() {
  val navController = LocalMainNavController.current

  NavHost(
    navController = navController,
    startDestination = HomeRoute,
    enterTransition = { NavigationAnimationTransitions.enterTransition },
    exitTransition = { NavigationAnimationTransitions.exitTransition },
    popEnterTransition = { NavigationAnimationTransitions.popEnterTransition },
    popExitTransition = { NavigationAnimationTransitions.popExitTransition },
  ) {
    composable<HomeRoute> {
      HomeScreen()
    }
  }
}

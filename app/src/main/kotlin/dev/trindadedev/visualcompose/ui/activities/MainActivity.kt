package dev.trindadedev.visualcompose.ui.activities

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController

import dev.trindadedev.visualcompose.navigation.MainNavHost
import dev.trindadedev.visualcompose.platform.LocalMainNavController
import dev.trindadedev.visualcompose.ui.theme.VisualComposeTheme

class MainActivity : ComponentActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    enableEdgeToEdge()
    super.onCreate(savedInstanceState)
    setContent {
      VisualComposeTheme {
        Surface(
          modifier = Modifier.fillMaxSize(), 
          color = MaterialTheme.colorScheme.background
        ) {
          ProvideMainCompositionLocals {
            MainNavHost() 
          }
        }
      }
    }
  }

  @Composable
  private fun ProvideMainCompositionLocals(content: @Composable () -> Unit) {
    val navController = rememberNavController()

    CompositionLocalProvider(
      LocalMainNavController provides navController, 
      content = content
    )
  }
}

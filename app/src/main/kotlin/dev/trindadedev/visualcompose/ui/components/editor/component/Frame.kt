package dev.trindadedev.visualcompose.ui.components.editor.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Frame(
  modifier: Modifier = Modifier,
  content: @Composable () -> Unit
) {
  Column(modifier = modifier.background(MaterialTheme.colorScheme.surfaceContainerLowest)) {
    StatusBar()
    Toolbar()
    content()
  }
}
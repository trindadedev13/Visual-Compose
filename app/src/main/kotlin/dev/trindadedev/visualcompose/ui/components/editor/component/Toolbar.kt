package dev.trindadedev.visualcompose.ui.components.editor.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Toolbar() {
  Box(
    modifier = Modifier
      .fillMaxWidth()
      .height(56.dp)
      .background(MaterialTheme.colorScheme.primary),
    contentAlignment = Alignment.CenterStart
  ) {
    Text(
      text = "App Name",
      color = MaterialTheme.colorScheme.onPrimary,
      fontSize = 18.sp,
      modifier = Modifier.padding(start = 16.dp)
    )
  }
}
package dev.trindadedev.visualcompose.ui.components.editor.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StatusBar(
  modifier: Modifier = Modifier
    .fillMaxWidth()
    .height(24.dp)
    .background(MaterialTheme.colorScheme.primary)
) {
  Box(
    modifier = modifier,
    contentAlignment = Alignment.Center
  ) {
    Row(
      modifier = Modifier.fillMaxWidth(),
      horizontalArrangement = Arrangement.SpaceBetween
    ) {
      Text(
        text = "MainScreen.kt",
        color = MaterialTheme.colorScheme.onPrimary,
        fontSize = 12.sp,
        modifier = Modifier.padding(start = 8.dp)
      )
      Row {
        Text(
          text = "12:00",
          color = MaterialTheme.colorScheme.onPrimary,
          fontSize = 12.sp,
          modifier = Modifier.padding(end = 8.dp)
        )
      }
    }
  }
}
package dev.trindadedev.visualcompose.ui.components.editor.palette

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Android
import androidx.compose.material3.Text
import androidx.compose.material3.Icon

import dev.trindadedev.visualcompose.ui.components.editor.component.impl.Component

@Composable
fun ComponentPalette(
  modifier: Modifier = Modifier,
  layouts: List<Component>,
  widgets: List<Component>
) {
  Column(modifier = modifier) {  
    Text(
      text = "Layouts",
      modifier = Modifier.padding(8.dp)
    )
    layouts.forEach { component ->
      ComponentPaletteItem(component = component)
    }
    Text(
      text = "Widgets",
      modifier = Modifier.padding(8.dp)
    )
    widgets.forEach { component ->
      ComponentPaletteItem(component = component)
    }
  }
}

@Composable
private fun ComponentPaletteItem(
  modifier: Modifier = Modifier,
  component: Component
) {
  Row(modifier = modifier) {
    Icon(
      modifier = Modifier.padding(start = 4.dp),
      imageVector = Icons.TwoTone.Android,
      contentDescription = component.type.toString()
    )
    Text(
      modifier = Modifier
        .padding(start = 3.dp, end = 4.dp)
        .fillMaxWidth(),
      text = component.type.toString(),
      fontSize = 11.sp
    )
  }
}
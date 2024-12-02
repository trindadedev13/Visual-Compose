package dev.trindadedev.visualcompose.ui.components.editor

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding 
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import dev.trindadedev.visualcompose.ui.components.editor.component.ComponentPane
import dev.trindadedev.visualcompose.ui.components.editor.palette.ComponentPalette
import dev.trindadedev.visualcompose.ui.components.editor.component.impl.getAllLayouts
import dev.trindadedev.visualcompose.ui.components.editor.component.impl.getAllWidgets

@Composable
fun UIEditor(
  modifier: Modifier = Modifier
) {
  Row(modifier = modifier) {
    ComponentPalette(
      modifier = Modifier
        .weight(1f)
        .fillMaxHeight(),
      layouts = getAllLayouts(),
      widgets = getAllWidgets()
    )
    ComponentPane(
      modifier = Modifier
        .weight(2f)
        .fillMaxHeight()
        .padding(end = 8.dp)
    )
  }
}
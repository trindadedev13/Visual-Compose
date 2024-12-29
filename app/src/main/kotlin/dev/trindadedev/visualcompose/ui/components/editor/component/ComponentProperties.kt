package dev.trindadedev.visualcompose.ui.components.editor.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material.icons.rounded.Height
import androidx.compose.material.icons.rounded.WidthNormal
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.graphics.vector.ImageVector
import dev.trindadedev.visualcompose.Strings
import dev.trindadedev.visualcompose.ui.components.editor.component.impl.Component
import dev.trindadedev.visualcompose.ui.components.editor.component.impl.ComponentClassInfoHandler

@Composable
fun ComponentProperties(component: Component) {
  val properties = getProperties(component)
  Row(modifier = Modifier.fillMaxWidth()) {
  
  }
}

@Composable
private fun getProperties(component: Component): List<ComponentPropertyModel> {
  val properties = mutableListOf<ComponentPropertyModel>()
  val classInfoHandler = ComponentClassInfoHandler(component)
  properties.add(
    ComponentPropertyModel(
      name = stringResource(id = Strings.property_width),
      icon = Icons.Rounded.WidthNormal
    )
  )
  properties.add(
    ComponentPropertyModel(
      name = stringResource(id = Strings.property_height),
      icon = Icons.Rounded.Height
    )
  )
  if (classInfoHandler.isText()) {
    properties.add(
      ComponentPropertyModel(
        name = stringResource(id = Strings.property_text),
        icon = Icons.Rounded.Edit
      )
    )
  }
  return properties.toList()
}
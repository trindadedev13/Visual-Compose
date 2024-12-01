package dev.trindadedev.visualcompose.ui.components.editor.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.background
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import dev.trindadedev.visualcompose.ui.components.editor.component.impl.Component
import dev.trindadedev.visualcompose.ui.components.editor.component.impl.ComponentType
import dev.trindadedev.visualcompose.ui.components.editor.component.impl.ComponentCategory
import dev.trindadedev.visualcompose.ui.components.editor.component.impl.emptyComponent
import dev.trindadedev.visualcompose.ui.components.editor.component.impl.ComponentComposableCreator
import dev.trindadedev.visualcompose.ui.components.editor.component.impl.ComponentComposableCreator.createComposable

@Composable
fun ComponentPane() {
  var isShowEditAttributeDialog by remember {
    mutableStateOf(false)
  }
  
  var component by remember {
    mutableStateOf<Component>(emptyComponent())
  }
  
  ComponentComposableCreator.defaultComponentClick = { c ->
    isShowEditAttributeDialog = true
    component = c
  }
  
  if (isShowEditAttributeDialog) {
    EditAttributeDialog(
      title = "Edit Attribute",
      label = component.textAttributes.text,
      initial = component.textAttributes.text,
      onConfirm = { newValue ->
        component.textAttributes.text = newValue
      },
      onDismiss = {
        isShowEditAttributeDialog = false
      }
    )
  }
  
  Frame(modifier = Modifier.padding(10.dp)){
    val parent = Component()
    parent.category = ComponentCategory.Layout
    parent.type = ComponentType.Column
    parent.attributes.modifier = Modifier.padding(10.dp)
  
    val button = Component()
    button.category = ComponentCategory.Widget
    button.type = ComponentType.Button
    button.textAttributes.text = "Button"
  
    val text = Component()
    text.category = ComponentCategory.Widget
    text.type = ComponentType.Text
    text.textAttributes.text = "Text"
  
    parent.addChilds(button, text)
    
    createComposable(component = parent)
  }
}
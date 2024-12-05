package dev.trindadedev.visualcompose.ui.components.editor.component.impl

import androidx.compose.runtime.Composable
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.Button

object ComponentComposableCreator {

  lateinit var defaultComponentClick: (Component) -> Unit 

  @Composable
  fun createComposable(component: Component) {
    if (component.attributes.onClick == null) {
      component.attributes.onClick = defaultComponentClick
    }
    when (component.type) {
      ComponentType.Nothing -> NothingComponent()
      ComponentType.Column -> createColumn(component = component)
      ComponentType.Text -> createText(component = component)
      ComponentType.Button -> createButton(component = component)
    }
  }
  
  @Composable
  fun createColumn(component: Component) {
    Column(
      modifier = component.attributes.modifier.clickable {
        component.attributes.onClick?.invoke(component)
      },
    ) {
      component.childs.forEach { child ->
        createComposable(child)
      }
    }
  }
  
  @Composable
  fun createText(component: Component) {
    Text(
      modifier = component.attributes.modifier.clickable {
        component.attributes.onClick?.invoke(component)
      },
      text = component.textAttributes.text
    )
  }
  
  @Composable
  fun createButton(component: Component) {
    Button(
      modifier = component.attributes.modifier,
      onClick = {
        component.attributes.onClick?.invoke(component)
      }
    ) {
      Text(text = component.textAttributes.text)
    }
  }
}

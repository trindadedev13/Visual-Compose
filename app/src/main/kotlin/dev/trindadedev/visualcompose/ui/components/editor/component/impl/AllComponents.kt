package dev.trindadedev.visualcompose.ui.components.editor.component.impl

fun getAllLayouts(): List<Component> {
  val column = Component().apply {
    category = ComponentCategory.Layout
    type = ComponentType.Column
  }
  return listOf(column)
}

fun getAllWidgets(): List<Component> {
  val button = Component().apply {
    category = ComponentCategory.Widget
    type = ComponentType.Button
  }
  val text = Component().apply {
    category = ComponentCategory.Widget
    type = ComponentType.Text
  }
  return listOf(button, text)
}
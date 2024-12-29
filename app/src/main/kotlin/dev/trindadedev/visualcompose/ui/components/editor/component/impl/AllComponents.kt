package dev.trindadedev.visualcompose.ui.components.editor.component.impl

fun getAllLayouts(): List<Component> = 
  listOf(Column)
  
fun getAllWidgets(): List<Component> =
  listOf(Button, Text)

val Column = Component().apply {
  category = ComponentCategory.Layout
  type = ComponentType.Column
}

val Button = Component().apply {
  category = ComponentCategory.Widget
  type = ComponentType.Button
}

val Text = Component().apply {
  category = ComponentCategory.Widget
  type = ComponentType.Text
}
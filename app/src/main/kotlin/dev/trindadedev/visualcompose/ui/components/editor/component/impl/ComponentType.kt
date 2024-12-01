package dev.trindadedev.visualcompose.ui.components.editor.component.impl

enum class ComponentType(val packageName: String) {
  Text("androidx.compose.material3.Text"),
  Button("androidx.compose.material3.Button"),
  Column("androidx.compose.foundation.layout.Column"),
  Nothing("dev.trindadedev.visualcompose.ui.components.editor.component.impl.NothingComponent");

  override fun toString(): String {
    return name
  }
}
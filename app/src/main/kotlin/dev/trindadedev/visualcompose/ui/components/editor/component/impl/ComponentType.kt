package dev.trindadedev.visualcompose.ui.components.editor.component.impl

enum class ComponentType(
  val packageName: String,
  val classInfo: String = "Invalid"
) {
  Text("androidx.compose.material3.Text", "Component.Text"),
  Button("androidx.compose.material3.Button", "Component.Text.Clickable"),
  Column("androidx.compose.foundation.layout.Column", "Component.Group"),
  Nothing("dev.trindadedev.visualcompose.ui.components.editor.component.impl.NothingComponent");

  override fun toString(): String {
    return name
  }
  
  fun getPackage(): String = packageName
  
  fun getClassInfo(): String = classInfo
}
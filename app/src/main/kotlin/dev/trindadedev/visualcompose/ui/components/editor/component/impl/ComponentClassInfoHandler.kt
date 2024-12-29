package dev.trindadedev.visualcompose.ui.components.editor.component.impl

class ComponentClassInfoHandler(component: Component) {

  fun classInfoHave(classInfo: String): Boolean =
    component.type.classInfo.contains(classInfo)
    
  fun isText(): Boolean = classInfoHave("Text")
  fun isGroup(): Boolean = classInfoHave("Group")
  fun isClickable(): Boolean = classInfoHave("Clickable")
}
package dev.trindadedev.visualcompose.ui.components.editor.component.impl

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.Dp

class Component {
  var type by mutableStateOf(ComponentType.Nothing)
  var category by mutableStateOf(ComponentCategory.Nothing)
  var attributes by mutableStateOf(Attributes())
  var textAttributes by mutableStateOf(TextAttributes())
  
  var displayName by mutableStateOf(type.toString())
  
  var childs = mutableStateListOf<Component>()
  
  class Attributes {
    var modifier by mutableStateOf<Modifier>(Modifier)
    var onClick: ((Component) -> Unit)? = null
  }
  
  class TextAttributes {
    var text by mutableStateOf("Text")
    var textColor by mutableStateOf(Color.Unspecified)
    var fontSize by mutableStateOf(TextUnit.Unspecified)
    var fontStyle by mutableStateOf<FontStyle?>(null)
    var fonWeight by mutableStateOf<FontWeight?>(null)
    var fontFamily by mutableStateOf<FontFamily?>(null)
    var maxLines by mutableStateOf(Int.MAX_VALUE)
    var minLines by mutableStateOf(1)
  }
  
  fun addChild(component: Component) {
    if (this.category == ComponentCategory.Layout) {
      childs.add(component)
      return 
    }
    throw ComponentNotAcceptChildException(this)
  }
  
  fun addChilds(vararg components: Component) {
    for (component in components) {
      addChild(component)
    }
  }
  
  fun removeChildAt(index: Int) {
    childs.removeAt(index)
  }
  
  fun getAt(index: Int) {
    childs.get(index)
  }
}
package dev.trindadedev.visualcompose.ui.components.editor.component.impl

class ComponentNotAcceptChildException(component: Component): Exception("${component.type.packageName} does not accept children.")
package dev.trindadedev.template.ui.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

/*
 * A Basic small TopAppBar
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
  title: @Composable () -> Unit,
  scrollBehavior: TopAppBarScrollBehavior,
  navigationIcon: @Composable (() -> Unit)? = null,
  actions: @Composable RowScope.() -> Unit = {},
  isLarge: Boolean = false
) {
  if (!isLarge) {
    TopAppBar(
      title = title,
      navigationIcon = {
        navigationIcon?.let {
           it()
        } 
      },
      actions = actions,
      scrollBehavior = scrollBehavior,
    )
  } else {
    LargeTopAppBar(
      title = title,
      navigationIcon = {
        navigationIcon?.let {
           it()
        } 
      },
      actions = actions,
      scrollBehavior = scrollBehavior,
    )
  }
}

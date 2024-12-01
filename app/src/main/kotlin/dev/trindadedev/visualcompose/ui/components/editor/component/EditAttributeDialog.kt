package dev.trindadedev.visualcompose.ui.components.editor.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import dev.trindadedev.visualcompose.Strings

@Composable
fun EditAttributeDialog(
  title: String,
  label: String,
  initial: String,
  onConfirm: (String) -> Unit,
  onDismiss: () -> Unit,
) {
  var inputValue by remember {
    mutableStateOf(initial) 
  }

  AlertDialog(
    onDismissRequest = onDismiss,
    title = {
      Text(text = title)
    },
    text = {
      Column {
        OutlinedTextField(
          value = inputValue,
          onValueChange = {
            inputValue = it 
          },
          label = {
            Text(text = label)
          },
          modifier = Modifier.fillMaxWidth(),
        )
      }
    },
    confirmButton = {
      Button(
        onClick = {
          onConfirm(inputValue)
          onDismiss()
        }
      ) {
        Text(text = stringResource(id = Strings.common_word_save))
      }
    },
    dismissButton = {
      OutlinedButton(
        onClick = onDismiss
      ) {
        Text(text = stringResource(id = Strings.common_word_cancel))
      }
    },
  )
}
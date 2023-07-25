package com.example.jetpackcomposetodoapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditDialog(isShowDialog: MutableState<Boolean>) {
    AlertDialog(
        onDismissRequest = { isShowDialog.value = false },
        title = { Text(text = "タスク新規作成") },
        text = {
            Column {
                Text(text = "タイトル")
                TextField(value = "", onValueChange = {})
                Text(text = "詳細")
                TextField(value = "", onValueChange = {})
            }
        },
        confirmButton = {
            Row(
                modifier = Modifier.padding(8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Button(
                    modifier = Modifier.width(120.dp),
                    onClick = { isShowDialog.value = false }
                ) {
                    Text(text = "キャンセル")
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(
                    modifier = Modifier.width(120.dp),
                    onClick = { isShowDialog.value = false }
                ) {
                    Text(text = "OK")
                }
            }
        }
    )
}
package com.fsanper.ejercicio04

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(
    name = "P1",
    showBackground = true, fontScale = 1.1f, showSystemUi = true, apiLevel = 33,
    device = Devices.NEXUS_6
)
@Composable
fun TextButtonExample() {
    var counter by rememberSaveable {
        mutableStateOf(0)
    }

    var enabled by rememberSaveable {
        mutableStateOf(true)
    }

    Column(
        Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {

        TextButton(onClick = { counter++ }) {
            Text("Clics: $counter")

        }

        Button(
            onClick = { enabled = false },
            enabled = enabled,
            colors = ButtonDefaults.buttonColors(contentColor = Color.White),
            border = BorderStroke(1.dp, Color.Red),
        ) {
            Text(text = "Enviar")

        }

        OutlinedButton(
            onClick = { enabled = false },
            enabled = enabled,
            modifier = Modifier.padding(top = 8.dp),
            /*colors = ButtonDefaults.buttonColors(contentColor = Color.White),
            border = BorderStroke(1.dp, Color.Red)*/
        ) {
            Text(text = "Enviar")

        }
    }

}
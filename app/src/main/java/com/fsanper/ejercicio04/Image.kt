package com.fsanper.ejercicio04

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun MyImage() {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.download02),
            contentDescription = "miFoto",
            alpha = 0.7f
        )
    }
}


@Composable
fun MyImageAdvance() {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.download),
            contentDescription = "miFoto",
            alpha = 0.7f,
            modifier = Modifier
                .clip(CircleShape)
                .border(1.dp, Color.Red, CircleShape)
        )
    }
}

@Preview(
    name = "P1",
    showBackground = true, fontScale = 1.1f, showSystemUi = true, apiLevel = 33,
    device = Devices.NEXUS_6
)
@Composable
fun MyIcon() {
    var context = LocalContext.current
    Column(
        Modifier
            .fillMaxWidth()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.Rounded.Star,
            contentDescription ="Icon",
            tint = Color.Blue,
            modifier = Modifier.clickable {
                Toast.makeText(context, "Estrella", Toast.LENGTH_SHORT).show()
            })
    }
}
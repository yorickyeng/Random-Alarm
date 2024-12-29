package com.fk.randomalarm.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SetAlarmScreen() {
    Column(
        modifier = Modifier.padding(vertical = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ClockBlock()
        Row {
            Spacer(Modifier.weight(1f))
            Button(onClick = {}) {
                Text(
                    text = "Cancel", fontSize = 30.sp, style = MaterialTheme.typography.titleMedium
                )
            }
            Spacer(Modifier.weight(1f))
            Button(onClick = {}) {
                Text(
                    text = "Save", fontSize = 30.sp, style = MaterialTheme.typography.titleMedium
                )
            }
            Spacer(Modifier.weight(1f))
        }
    }
}

@Composable
fun ClockBlock() {
    Box(modifier = Modifier.padding(8.dp)) {
        Text(
            text = "08:00", fontSize = 60.sp, style = MaterialTheme.typography.titleMedium
        )
    }
}

@Composable
@Preview(showSystemUi = true)
fun ClockPreview() {
    SetAlarmScreen()
}
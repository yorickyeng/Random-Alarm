package com.fk.randomalarm.presentation

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.fk.randomalarm.domain.entity.Routes

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.padding(vertical = 16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Random Alarm", fontSize = 30.sp, style = MaterialTheme.typography.titleMedium
        )
        AlarmBlock(navController)
    }
}

@Composable
fun AlarmBlock(navController: NavController) {
    val checkedState = remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .border(3.dp, MaterialTheme.colorScheme.onBackground, shape = CircleShape)
            .clickable(onClick = { navController.navigate(Routes.SetAlarm.route) }),
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "08:00", fontSize = 25.sp, style = MaterialTheme.typography.titleMedium
            )
            Spacer(Modifier.weight(2f, true))
            Text(
                text = "Mon, 30 Dec", style = MaterialTheme.typography.titleMedium
            )
            Spacer(Modifier.weight(1f))
            Switch(checked = checkedState.value, onCheckedChange = { checkedState.value = it })
        }
    }
}
package com.fk.randomalarm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fk.randomalarm.domain.entity.Routes
import com.fk.randomalarm.presentation.HomeScreen
import com.fk.randomalarm.presentation.SetAlarmScreen
import com.fk.randomalarm.ui.theme.RandomAlarmTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            RandomAlarmTheme {
                Scaffold(floatingActionButton = {
                    FloatingActionButton(onClick = {
                        navController.navigate(Routes.SetAlarm.route) {
                            launchSingleTop = true
                        }
                    }) {
                        Icon(Icons.Filled.Add, contentDescription = "Add")
                    }
                }) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "Home",
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    ) {
                        composable(Routes.Home.route) { HomeScreen(navController) }
                        composable(Routes.SetAlarm.route) { SetAlarmScreen() }
                    }
                }
            }
        }
    }
}
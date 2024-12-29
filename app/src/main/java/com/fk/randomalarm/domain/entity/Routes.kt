package com.fk.randomalarm.domain.entity

sealed class Routes(val route: String) {
    data object Home : Routes("Home")
    data object SetAlarm : Routes("SetAlarm")
}
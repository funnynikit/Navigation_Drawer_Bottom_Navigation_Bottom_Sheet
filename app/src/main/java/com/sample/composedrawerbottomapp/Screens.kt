package com.sample.composedrawerbottomapp

sealed class Screens (val screen : String)
{
    data object Home : Screens("home")
    data object Profile : Screens("profile")
    data object Notification : Screens("notification")
    data object Settings : Screens("settings")
    data object Post : Screens("post")
    data object Search : Screens("search")
}
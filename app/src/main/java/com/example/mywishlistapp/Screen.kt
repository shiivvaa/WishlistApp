package com.example.mywishlistapp

sealed class Screen(val route:String) {
    object HomeScreen: Screen("home_Sceen")
    object AddScreen: Screen("add_Screen")
}
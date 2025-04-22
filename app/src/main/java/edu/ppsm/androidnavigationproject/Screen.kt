package edu.ppsm.androidnavigationproject

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object DetailsScreen : Screen("details_screen")
    object InfoScreen : Screen("info_screen")
}
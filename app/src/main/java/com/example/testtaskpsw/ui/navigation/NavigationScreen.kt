package com.example.testtaskpsw.ui.navigation

sealed class NavigationScreen(
    val route: String
) {
    object Main: NavigationScreen(
        route = "main"
    )
    object Catalog: NavigationScreen(
        route = "catalog"
    )
    object Items: NavigationScreen(
        route = "items"
    )
    object Item: NavigationScreen(
        route = "item"
    )
}

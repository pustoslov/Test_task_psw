package com.example.testtaskpsw.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.testtaskpsw.ui.CatalogViewModel
import com.example.testtaskpsw.ui.screens.CatalogScreen
import com.example.testtaskpsw.ui.screens.ItemScreen
import com.example.testtaskpsw.ui.screens.ItemsScreen
import com.example.testtaskpsw.ui.screens.MainScreen

@Composable
fun NavGraph(
    navController: NavHostController,
    viewModel: CatalogViewModel
) {

    NavHost(
        navController = navController,
        startDestination = NavigationScreen.Main.route
    ) {
        composable(NavigationScreen.Main.route) {
            MainScreen(
                onCatalogClick = {
                    navController.navigate(NavigationScreen.Catalog.route)
                }
            )
        }
        composable(NavigationScreen.Catalog.route) {
            CatalogScreen(
                onCategoryClick = {
                    viewModel.updateItemsList(it)
                    navController.navigate(NavigationScreen.Items.route)
                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
        composable(NavigationScreen.Items.route) {
            ItemsScreen(
                items = viewModel.currentItems,
                onItemClick = {
                    viewModel.updateItem(it)
                    navController.navigate(NavigationScreen.Item.route)
                },
                onBackClick = { navController.popBackStack() }
            )
        }
        composable(NavigationScreen.Item.route) {
            ItemScreen(
                item = viewModel.currentItem,
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }

}
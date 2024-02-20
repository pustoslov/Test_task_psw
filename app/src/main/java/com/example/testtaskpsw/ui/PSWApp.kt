package com.example.testtaskpsw.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.testtaskpsw.ui.navigation.NavGraph
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun PSWApp(
    viewModel: CatalogViewModel = viewModel()
) {
    val navController = rememberNavController()

    NavGraph(
        navController = navController,
        viewModel = viewModel
    )
}
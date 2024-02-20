package com.example.testtaskpsw.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.testtaskpsw.R
import com.example.testtaskpsw.ui.components.CatalogWindow
import com.example.testtaskpsw.ui.components.TopBar

@Composable
fun CatalogScreen(
    onCategoryClick: (String) -> Unit,
    onBackClick: () -> Unit
) {

    Column {
        TopBar(
            onBackClick = { onBackClick() },
            title = "Каталог"
        )
        Column(
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .padding(horizontal = 15.dp)
                .fillMaxSize()
        ) {
            CatalogWindow(
                image = painterResource(id = R.drawable.pizza_catalog),
                title = "Пицца",
                modifier = Modifier
                    .padding(vertical = 7.5.dp)
                    .padding(top = 15.dp)
                    .clickable {
                        onCategoryClick("pizza")
                    }
            )
            CatalogWindow(
                image = painterResource(id = R.drawable.sushi),
                title = "Суши",
                modifier = Modifier
                    .padding(vertical = 7.5.dp)
                    .clickable {
                        onCategoryClick("sushi")
                    }
            )
            CatalogWindow(
                image = painterResource(id = R.drawable.wok),
                title = "Вок",
                modifier = Modifier
                    .padding(vertical = 7.5.dp)
                    .clickable {
                        onCategoryClick("wok")
                    }
            )
            CatalogWindow(
                image = painterResource(id = R.drawable.drinks),
                title = "Напитки",
                modifier = Modifier
                    .padding(vertical = 7.5.dp)
                    .clickable {
                        onCategoryClick("drinks")
                    }
            )
        }
    }

}
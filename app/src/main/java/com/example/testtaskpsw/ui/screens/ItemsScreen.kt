package com.example.testtaskpsw.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.testtaskpsw.data.Item
import com.example.testtaskpsw.ui.components.ItemCard
import com.example.testtaskpsw.ui.components.TopBar

@Composable
fun ItemsScreen(
    items: List<Item>,
    onItemClick: (Item) -> Unit,
    onBackClick: () -> Unit
) {

    val title = when (items[0].category) {
        "pizza" -> "Пицца"
        "sushi" -> "Суши"
        "wok" -> "Вок"
        "drinks" -> "Напитки"
        else -> ""
    }

    Column(
        verticalArrangement = Arrangement.Top
    ) {
        TopBar(
            onBackClick = { onBackClick() },
            title = title
        )
        LazyColumn(
            contentPadding = PaddingValues(horizontal = 15.dp)
        ) {
            items(items) {
                ItemCard(
                    item = it,
                    modifier = Modifier
                        .padding(vertical = 7.5.dp)
                        .clickable { onItemClick(it) }
                )
            }
        }
    }


}
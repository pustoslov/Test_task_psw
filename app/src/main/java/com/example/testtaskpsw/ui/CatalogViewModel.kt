package com.example.testtaskpsw.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.testtaskpsw.data.Item
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CatalogViewModel @Inject constructor(

): ViewModel() {

    val items: List<Item> = com.example.testtaskpsw.data.items

    var currentItems by mutableStateOf(listOf<Item>())
        private set
    var currentItem by mutableStateOf(items[0])
        private set

    fun updateItem(item: Item) {
        currentItem = item
    }

    fun updateItemsList(category: String) {
        currentItems = items.filter { it.category == category }
    }

}
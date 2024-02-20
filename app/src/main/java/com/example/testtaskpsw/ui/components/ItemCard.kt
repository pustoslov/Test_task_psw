package com.example.testtaskpsw.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testtaskpsw.R
import com.example.testtaskpsw.data.Item

@Composable
fun ItemCard(
    item: Item,
    modifier: Modifier = Modifier
) {

    Card(
        modifier = modifier
            .height(150.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(item.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(150.dp)
            )
            Column(
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 15.dp)
            ) {
                Text(
                    text = item.title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(vertical = 10.dp)
                )
                Text(
                    text = item.description,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 3,
                    modifier = Modifier
                        .weight(1f)
                )
                Box(
                    contentAlignment = Alignment.CenterEnd,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .background(
                                MaterialTheme.colorScheme.primary,
                                RoundedCornerShape(5.dp)
                            )
                    ) {
                        Text(
                            text = "${item.cost.toInt()} ₽",
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 16.sp,
                            color = MaterialTheme.colorScheme.onPrimary,
                            modifier = Modifier
                                .padding(vertical = 5.dp, horizontal = 8.dp)
                        )
                    }
                }
            }
        }
    }

}

@Composable
@Preview
private fun CardPreview() {
    val item = Item(
        category = "sushi",
        title = "Роллы Нью-Мексико",
        description = "Нью-Мексико — юго-западный штат США. Обладая населением всего чуть" +
                " более, чем два миллиона человек, штат занимает пятое место в стране по" +
                " площади. Столица — Санта-Фе, самый же крупный город — Альбукерке.",
        image = R.drawable.new_mexico,
        cost = 700.0
    )
    ItemCard(item = item)
}
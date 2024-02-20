package com.example.testtaskpsw.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testtaskpsw.data.Item
import com.example.testtaskpsw.ui.components.TopBar

@Composable
fun ItemScreen(
    item: Item,
    onBackClick: () -> Unit
) {
    Column {
        TopBar(
            onBackClick = { onBackClick() },
            title = ""
        )
        LazyColumn(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .padding(horizontal = 15.dp)
        ) {
            item{
                Image(
                    painter = painterResource(item.image),
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 30.dp)
                        .clip(RoundedCornerShape(15.dp))
                )
            }
            item{
                Text(
                    text = item.title,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(bottom = 30.dp)
                )
            }
            item{
                Text(
                    text = item.description,
                    modifier = Modifier
                        .padding(bottom = 30.dp)
                )
            }
            item{
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .height(70.dp)
                        .width(400.dp)
                        .background(
                            MaterialTheme.colorScheme.primary,
                            RoundedCornerShape(15.dp)
                        )
                ) {
                    Text(
                        text = "Добавить в корзину ${item.cost.toInt()}₽",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = MaterialTheme.colorScheme.onPrimary
                    )
                }
            }
            item{
                Spacer(modifier = Modifier.height(30.dp))
            }
        }
    }
}
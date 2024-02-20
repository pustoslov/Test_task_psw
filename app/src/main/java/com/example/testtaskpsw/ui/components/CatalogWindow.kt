package com.example.testtaskpsw.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testtaskpsw.R

@Composable
fun CatalogWindow(
    image: Painter,
    title: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(width = 400.dp, height = 130.dp)
            .clip(RoundedCornerShape(15.dp))
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
        )
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(0.4f))
        ) {
            Text(
                text = title,
                fontWeight = FontWeight.SemiBold,
                fontSize = 22.sp,
                color = Color.White
            )
        }
    }
}

@Composable
@Preview
private fun CatalogPreview() {
    CatalogWindow(
        image = painterResource(id = R.drawable.pizza_catalog),
        title = "Пицца"
    )
}
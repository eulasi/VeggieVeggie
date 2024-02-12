package com.example.uilazyscrolls.ui.elements.herbspage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uilazyscrolls.data.herbsproductdata.getRandomHerbProductImage

@Preview(showBackground = true)
@Composable
fun PreviewProductItemElement() {
    val herbsProductImageResourceId = getRandomHerbProductImage(
        context = LocalContext.current
    )
    ProductItemElement(
        herbsProductTitle = "Spirulina",
        herbsProductPrice = 95.0,
        herbsProductResourceId = herbsProductImageResourceId
    )
}

@Composable
fun ProductItemElement(
    herbsProductTitle: String,
    herbsProductPrice: Double,
    herbsProductResourceId: Painter
) {
    Box(
        modifier = Modifier
            .height(250.dp)
            .width(260.dp),


    ) {
        Image(
            painter = herbsProductResourceId,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(165.dp)
                .width(165.dp)
                .padding(start = 12.dp, top = 12.dp, end = 18.dp, bottom = 18.dp)
                .clip(shape = RoundedCornerShape(6.dp))
                .align(Alignment.TopStart)
        )
        Icon(
            Icons.Filled.FavoriteBorder,
            contentDescription = "null",
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(end = 14.dp, top = 12.dp)
                .size(26.dp)

        )
        Text(
            text = "$${String.format(" %.2f", herbsProductPrice)}",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 14.dp, bottom = 12.dp)
        )
        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
        ) {
            Text(
                text = herbsProductTitle,
                fontSize = 15.sp,
                modifier = Modifier
                    .padding(start = 12.dp)
            )
            Row(
                modifier = Modifier
                    .padding(top = 8.dp, start = 12.dp, bottom = 12.dp)
            ) {
                Icon(
                    Icons.Filled.Star,
                    contentDescription = "null",
                    modifier = Modifier
                        .size(20.dp)
                )
                Spacer(modifier = Modifier.width(2.dp))
                Icon(
                    Icons.Filled.Star,
                    contentDescription = "null",
                    modifier = Modifier
                        .size(20.dp)
                )
                Spacer(modifier = Modifier.width(2.dp))
                Icon(
                    Icons.Filled.Star,
                    contentDescription = "null",
                    modifier = Modifier
                        .size(20.dp)
                )
                Spacer(modifier = Modifier.width(2.dp))
                Icon(
                    Icons.Filled.Star,
                    contentDescription = "null",
                    modifier = Modifier
                        .size(20.dp)
                )
                Spacer(modifier = Modifier.width(2.dp))
                Icon(
                    Icons.Filled.Star,
                    contentDescription = "null",
                    modifier = Modifier
                        .size(20.dp)
                )
            }
        }
    }
}
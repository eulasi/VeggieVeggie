package com.example.uilazyscrolls.ui.elements.fruitspage

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun PreviewStaticPayButtonElement() {
    StaticPayButtonElement(
    )
}

@Composable
fun StaticPayButtonElement(
) {
    Row(
        modifier = Modifier
            .height(130.dp)
            .width(350.dp)
            .padding(22.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(Color.Blue),

        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,

        ) {
        Column(
            modifier = Modifier
                .padding(22.dp),

            ) {
            Text(
                text = "Together to pay",
                color = Color.White)
            Text(
                text = "$24.66",
                fontWeight = FontWeight.Bold,
                color = Color.White

                )
        }

        Box(
            modifier = Modifier
                .padding(22.dp)
                .size(40.dp)
                .border(
                    width = 1.dp,
                    color = Color.White,
                    shape = CircleShape
                )
        ) {
            Icon(
                Icons.Filled.KeyboardArrowRight,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier
                    .size(30.dp)
                    .align(Alignment.Center)

            )
        }
    }
}
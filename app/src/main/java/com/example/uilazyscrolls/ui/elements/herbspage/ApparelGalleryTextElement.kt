package com.example.uilazyscrolls.ui.elements.herbspage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun PreviewApparelGalleryTextElement() {
    ApparelGalleryTextElement(
        herbsText = "Chips"
    )
}

@Composable
fun ApparelGalleryTextElement(
    modifier: Modifier = Modifier,
    herbsText: String
) {
    Column(
        modifier = Modifier
            .height(110.dp)
            .width(350.dp)
            .padding(22.dp)
            .background(Color.Gray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = herbsText,
                    fontSize = 24.sp,
            color = Color.White
        )
    }
}
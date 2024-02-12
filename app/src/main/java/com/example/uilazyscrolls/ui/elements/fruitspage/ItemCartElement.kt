package com.example.uilazyscrolls.ui.elements.fruitspage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uilazyscrolls.data.fruitdata.getRandomFruitImage
import java.util.Locale


@Preview(showBackground = true)
@Composable
fun PreviewItemCartElement() {
    val fruitResourceId = getRandomFruitImage(
        context = androidx.compose.ui.platform.LocalContext.current
    )
    ItemCartElement(
        modifier = Modifier.padding(16.dp),
        fruit = "Apple",
        weight = 0.75,
        pricePerKg = 1.50,
        fruitResourceId = fruitResourceId
    )
}

@Composable
fun ItemCartElement(
    modifier: Modifier = Modifier,
    fruit: String,
    weight: Double,
    pricePerKg: Double,
    fruitResourceId: Painter
) {
    Row(
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.CenterVertically)
        ) {
            Image(
                painter = fruitResourceId,
                contentDescription = null,
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)
                    .clip(shape = RoundedCornerShape(6.dp)),
            )
            Column(
                modifier = Modifier
                    .offset(x = 36.dp, y = (-10).dp)
                    .clip(shape = RoundedCornerShape(6.dp))
                    .background(Color.LightGray)
                    .padding(5.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = String.format(Locale.US, "%.1f", weight),
                    fontSize = 12.sp,

                    )
                Text(
                    text = "kg",
                    fontSize = 12.sp,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }

        }
        Column(
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .padding(start = 18.dp)
        ) {
            Text(text = fruit)
            Row {
                Text(text = "$${String.format(Locale.US, "%.2f", weight * pricePerKg)}")
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = "By weight, $${String.format(Locale.US, "%.2f", pricePerKg)} / kg",
                    color = Color.Gray,
                    fontSize = 9.sp,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
        }
        Spacer(modifier = Modifier.width(6.dp))
        Text(
            text = "Edit",
            color = Color.Blue,
            textDecoration = androidx.compose.ui.text.style.TextDecoration.Underline,
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .padding(20.dp)
        )
    }
}

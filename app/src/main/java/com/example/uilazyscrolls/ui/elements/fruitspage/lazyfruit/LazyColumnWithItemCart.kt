package com.example.uilazyscrolls.ui.elements.fruitspage.lazyfruit

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uilazyscrolls.data.fruitdata.generateRandomFruit
import com.example.uilazyscrolls.data.fruitdata.generateRandomPrice
import com.example.uilazyscrolls.data.fruitdata.generateRandomWeight
import com.example.uilazyscrolls.data.fruitdata.getRandomFruitImage
import com.example.uilazyscrolls.ui.elements.fruitspage.ItemCartElement

@Preview(showBackground = true)
@Composable
fun PreviewLazyColumnWithItemCartElements() {
    val elements = List(10) { index ->
        "Element $index" // Generating some placeholder text
    }
    LazyColumnWithItemCart(elements)
}

@Composable
fun LazyColumnWithItemCart(elements: List<String>) {
    LazyColumn {
        items(elements.size) { _ ->
            val fruitPainter = getRandomFruitImage(
                context = androidx.compose.ui.platform.LocalContext.current
            )
            ItemCartElement(
                modifier = Modifier.padding(16.dp),
                fruit = generateRandomFruit(),
                weight = generateRandomWeight(),
                pricePerKg = generateRandomPrice(),
                fruitResourceId = fruitPainter

            )
        }
    }
}


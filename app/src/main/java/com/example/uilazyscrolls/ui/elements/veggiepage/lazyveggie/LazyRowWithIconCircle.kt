package com.example.uilazyscrolls.ui.elements.veggiepage.lazyveggie

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uilazyscrolls.data.veggieicondata.generateRandomVeggie
import com.example.uilazyscrolls.data.veggieicondata.getRandomVeggieIconImage
import com.example.uilazyscrolls.ui.elements.veggiepage.IconCircleWithImgElement

@Preview(showBackground = true)
@Composable
fun LazyRowWithIconCirclePreview() {
    val elements = List(10) { index ->
        "Element $index" // Generating some placeholder text
    }
    LazyRowWithIconCircle(elements)
}

@Composable
fun LazyRowWithIconCircle(elements: List<String>) {
    LazyRow {
        items(elements.size) { _ ->
            val veggiePainter = getRandomVeggieIconImage(
                context = androidx.compose.ui.platform.LocalContext.current
            )
            IconCircleWithImgElement(
                modifier = Modifier.padding(8.dp),
                veggieImageResourceId = veggiePainter,
                veggie = generateRandomVeggie(),
            )
        }
    }
}

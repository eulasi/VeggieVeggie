package com.example.uilazyscrolls.ui.elements.veggiepage.lazyveggie

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uilazyscrolls.data.veggiesquaredata.generateVeggieSquaredText
import com.example.uilazyscrolls.data.veggiesquaredata.getRandomVeggieSquaredImage
import com.example.uilazyscrolls.ui.elements.veggiepage.ImageSquareWithMediumHeaderElement

@Preview(showBackground = true)
@Composable
fun PreviewLazyRowWithImageSquareElements() {
    val elements = List(6) { index ->
        "Element $index" // Generating some placeholder text
    }
    LazyRowWithImageSquare(elements)
}

@Composable
fun LazyRowWithImageSquare(elements: List<String>) {
    LazyRow {
        items(elements.size) { _ ->
            val veggieHeadPainter = getRandomVeggieSquaredImage(
                context = androidx.compose.ui.platform.LocalContext.current
            )
            ImageSquareWithMediumHeaderElement(
                modifier = Modifier.padding(8.dp),
                veggieImageSquaredResourceId = veggieHeadPainter,
                veggieHead = generateVeggieSquaredText()
            )
        }
    }
}

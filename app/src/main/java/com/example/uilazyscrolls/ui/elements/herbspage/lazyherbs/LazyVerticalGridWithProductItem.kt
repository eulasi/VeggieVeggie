package com.example.uilazyscrolls.ui.elements.herbspage.lazyherbs

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.uilazyscrolls.data.herbsproductdata.generateHerbsProductPrice
import com.example.uilazyscrolls.data.herbsproductdata.generateHerbsProductText
import com.example.uilazyscrolls.data.herbsproductdata.getRandomHerbProductImage
import com.example.uilazyscrolls.ui.elements.herbspage.ProductItemElement

@Preview(showBackground = true)
@Composable
fun LazyVerticalGridWithProductItemElementsPreview() {
    val elements = List(30) { index ->

        "Element $index" // Generating some placeholder data
    }
    LazyVerticalGridWithProductItemElements(elements)
}

@Composable
fun LazyVerticalGridWithProductItemElements(elements: List<String>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
    ) {
        items(elements.size) { _ ->
            val herbsTitlePainter = getRandomHerbProductImage(
                context = LocalContext.current)
            ProductItemElement(
                herbsProductTitle = generateHerbsProductText(),
                herbsProductPrice = generateHerbsProductPrice(),
                herbsProductResourceId = herbsTitlePainter

            )
        }
    }
}
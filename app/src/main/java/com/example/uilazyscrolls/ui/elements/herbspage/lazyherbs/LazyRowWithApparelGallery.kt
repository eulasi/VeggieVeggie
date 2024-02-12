package com.example.uilazyscrolls.ui.elements.herbspage.lazyherbs

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uilazyscrolls.data.herbsdata.generateHerbsText
import com.example.uilazyscrolls.ui.elements.herbspage.ApparelGalleryTextElement

@Preview(showBackground = true)
@Composable
fun PreviewLazyRowWithApparelGallery() {
    val elements = List(10) { index ->
        "Element $index" // Generating some placeholder text
    }
    LazyRowWithApparelGallery(elements)
}

@Composable
fun LazyRowWithApparelGallery(elements: List<String>) {
    LazyRow {
        items(elements.size) { _ ->
            ApparelGalleryTextElement(
                modifier = Modifier.padding(start = 2.dp, end = 2.dp, top = 18.dp, bottom = 18.dp),
                herbsText = generateHerbsText()

            )
        }
    }
}
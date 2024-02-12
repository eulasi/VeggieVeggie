package com.example.uilazyscrolls.ui.elements.veggiepage.lazyveggie


import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uilazyscrolls.data.veggieheaddata.generateVeggieHeadText
import com.example.uilazyscrolls.data.veggieheaddata.getRandomVeggieHeadImage
import com.example.uilazyscrolls.ui.elements.veggiepage.ImageHeaderWithBlurbsElement

@Preview(showBackground = true)
@Composable
fun PreviewLazyRowWithImageHeader() {
    val elements = List(10) { index ->
        "Element $index" // Generating some placeholder text
    }
    LazyRowWithImageHeader(elements)
}

@Composable
fun LazyRowWithImageHeader(elements: List<String>) {
    LazyRow {
        items(elements.size) { _ ->
            val veggieTitlePainter = getRandomVeggieHeadImage(
                context = LocalContext.current
            )
            ImageHeaderWithBlurbsElement(
                modifier = Modifier
                    .padding(start = 6.dp, end = 6.dp, top = 18.dp, bottom = 18.dp),
                veggieImageHeadResourceId = veggieTitlePainter,
                veggieTitle = generateVeggieHeadText()
            )
        }
    }
}
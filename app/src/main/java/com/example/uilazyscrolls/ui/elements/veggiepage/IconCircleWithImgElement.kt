package com.example.uilazyscrolls.ui.elements.veggiepage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uilazyscrolls.data.veggieicondata.getRandomVeggieIconImage
import com.example.uilazyscrolls.ui.theme.UILazyScrollsTheme


@Preview(showBackground = true)
@Composable
fun PreviewIconCircleWithImgElement() {
    val veggieImageResourceId = getRandomVeggieIconImage(
        context = androidx.compose.ui.platform.LocalContext.current
    )
    UILazyScrollsTheme {
        IconCircleWithImgElement(
            modifier = Modifier.padding(8.dp),
            veggie = "Broccoli",
            veggieImageResourceId = veggieImageResourceId
        )
    }

}

@Composable
fun IconCircleWithImgElement(
    modifier: Modifier = Modifier,
    veggieImageResourceId: Painter,
    veggie: String
) {
    Column(
    modifier = modifier,
    horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Image(
            painter = veggieImageResourceId,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(88.dp)
                .clip(CircleShape),

        )
        Text(
            text = veggie,
            modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 8.dp),
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

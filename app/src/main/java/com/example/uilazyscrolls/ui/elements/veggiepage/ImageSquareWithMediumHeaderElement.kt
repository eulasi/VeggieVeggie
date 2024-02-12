package com.example.uilazyscrolls.ui.elements.veggiepage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uilazyscrolls.data.veggiesquaredata.getRandomVeggieSquaredImage


@Preview(showBackground = true)
@Composable
fun ImageSquareWithMediumHeaderElementPreview() {
    val veggieImageSquaredResourceId = getRandomVeggieSquaredImage(
        context = androidx.compose.ui.platform.LocalContext.current
    )
    ImageSquareWithMediumHeaderElement(
        modifier = Modifier
            .padding(8.dp),
        veggieHead = "Veggie Brain",
        veggieImageSquaredResourceId = veggieImageSquaredResourceId
    )
}

@Composable
fun ImageSquareWithMediumHeaderElement(
    modifier: Modifier = Modifier,
    veggieImageSquaredResourceId: Painter,
    veggieHead: String
) {
    Column(
        modifier = modifier
            .padding(8.dp)

    ) {
        Text(
            text = veggieHead,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.bodyLarge

        )
        Spacer(
            modifier = Modifier
                .size(8.dp)
        )
        Image(
            painter = veggieImageSquaredResourceId,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(160.dp)
                .width(250.dp)
                .clip(shape = RoundedCornerShape(6.dp))
        )
    }

}
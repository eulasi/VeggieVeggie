
package com.example.uilazyscrolls.ui.elements.veggiepage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uilazyscrolls.data.veggieheaddata.getRandomVeggieHeadImage

@Preview(showBackground = true)
@Composable
fun ImageHeaderWithBlurbsElementPreview() {
    val veggieImageHeadResourceId = getRandomVeggieHeadImage(
        context = LocalContext.current
    )
    ImageHeaderWithBlurbsElement(
        modifier = Modifier
            .padding(26.dp),
        veggieTitle = "How to go Green",
        veggieImageHeadResourceId = veggieImageHeadResourceId
    )
}

@Composable
fun ImageHeaderWithBlurbsElement(
    modifier: Modifier = Modifier,
    veggieImageHeadResourceId: Painter,
    veggieTitle: String
) {
    Column(
        modifier = modifier
            .padding(8.dp)


    ) {
        Box(
            modifier = modifier

        ) {
            Image(
                painter = veggieImageHeadResourceId,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(160.dp)
                    .width(250.dp)
                    .clip(shape = RoundedCornerShape(6.dp))
            )
            Box(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .offset(x = 16.dp, y = 29.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(56.dp)
                        .clip(shape = CircleShape)
                        .background(Color.LightGray)
                )
                {
                    Icon(
                        Icons.Filled.PlayArrow,
                        contentDescription = "null",
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(34.dp)
                    )
                }
            }
        }
        Spacer(
            modifier = Modifier.height(8.dp)
        )
        Column(
            modifier = Modifier

                .padding(horizontal = 24.dp),
        ) {
            Text(
                text = veggieTitle,
                fontSize = 18.sp,
                textAlign = TextAlign.Center
            )
            Spacer(
                modifier = Modifier.height(4.dp)
            )
            Text(
                text = "5 min",
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                color = Color.Gray
            )
        }
    }
}
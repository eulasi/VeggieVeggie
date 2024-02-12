package com.example.uilazyscrolls.ui.elements.herbspage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uilazyscrolls.R


@Preview(showBackground = true)
@Composable
fun PreviewDescriptionElement() {
    ProductDescriptionElement()
}

@Composable
fun ProductDescriptionElement() {
    Column(
        modifier = Modifier
            .height(780.dp)
            .width(5000.dp),
    ) {

        Image(
            painter = painterResource(R.drawable.image31),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(240.dp)
                .width(240.dp)
                .padding(start = 12.dp, top = 28.dp, end = 18.dp, bottom = 18.dp)
                .clip(shape = RoundedCornerShape(6.dp))
                .align(Alignment.CenterHorizontally)

        )

        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 12.dp)
        ) {
            Icon(
                Icons.Filled.AddCircle,
                contentDescription = "null",
                modifier = Modifier
                    .size(10.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Icon(
                Icons.Filled.AddCircle,
                contentDescription = "null",
                modifier = Modifier
                    .size(10.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Icon(
                Icons.Filled.AddCircle,
                contentDescription = "null",
                modifier = Modifier
                    .size(10.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Icon(
                Icons.Filled.AddCircle,
                contentDescription = "null",
                modifier = Modifier
                    .size(10.dp)
            )
        }

        Box(
            modifier = Modifier
                .align(Alignment.End)
                .padding(end = 24.dp, top = 24.dp)
                .shadow(12.dp, shape = RoundedCornerShape(34.dp))
        ) {
            Box(
                modifier = Modifier
                    .size(44.dp)
                    .clip(shape = CircleShape)
                    .background(Color.LightGray)
            )
            {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "null",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(22.dp)
                )
            }

        }

        Column{
            Text(
                text = "Chuck Taylor All Star Leather",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 26.dp, start = 24.dp)

            )
            Spacer(modifier = Modifier.width(2.dp))
            Text(
                text = "The Converse Chick Taylor All Star Leather Sneaker adds A rich Textured leather upper onto the world's most iconic sneaker.",
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(start = 24.dp, end = 24.dp, top = 20.dp)
            )
            Spacer(modifier = Modifier.width(2.dp))
            Text(
                text = "more",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red,
                modifier = Modifier
                    .padding(start = 24.dp, end = 24.dp, top = 2.dp)

            )
        }

        Row {
            Row(
                modifier = Modifier
                    .padding(22.dp)
                    .height(60.dp)
                    .width(130.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Gray,
                        shape = RoundedCornerShape(4.dp)

                    )


            ) {
                Text(
                    text = "Qty",
                    fontSize = 22.sp,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 18.dp)
                )
                Spacer(modifier = Modifier.width(28.dp))
                Icon(
                    Icons.Filled.KeyboardArrowDown,
                    contentDescription = "null",
                    modifier = Modifier
                        .size(40.dp)
                        .align(Alignment.CenterVertically)
                        .padding(start = 12.dp)
                )

            }
            Row(
                modifier = Modifier
                    .padding(start = 6.dp, top = 22.dp)
                    .height(60.dp)
                    .width(190.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Gray,
                        shape = RoundedCornerShape(4.dp)

                    )
            ) {
                Text(
                    text = "Select Size",
                    fontSize = 22.sp,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 18.dp)
                )
                Spacer(modifier = Modifier.width(28.dp))
                Icon(
                    Icons.Filled.Add,
                    contentDescription = "null",
                    modifier = Modifier
                        .size(26.dp)
                        .align(Alignment.CenterVertically)
                        .padding(start = 2.dp)
                )
            }
        }

        Row(
            modifier = Modifier
                .padding(top = 16.dp)
        )
        {
            Text(
                text = "Colors",
                fontSize = 22.sp,
                modifier = Modifier
                    .padding(start = 42.dp)
                    .align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.width(28.dp))
            Row {
                Icon(
                    Icons.Filled.AddCircle,
                    contentDescription = "null",
                    modifier = Modifier
                        .size(18.dp)
                        .align(Alignment.CenterVertically)

                )
                Spacer(modifier = Modifier.width(16.dp))
                Icon(
                    Icons.Filled.AddCircle,
                    contentDescription = "null",
                    modifier = Modifier
                        .size(18.dp)
                        .align(Alignment.CenterVertically)

                )
                Spacer(modifier = Modifier.width(16.dp))
                Icon(
                    Icons.Filled.AddCircle,
                    contentDescription = "null",
                    modifier = Modifier
                        .size(18.dp)
                        .align(Alignment.CenterVertically)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Icon(
                    Icons.Filled.KeyboardArrowDown,
                    contentDescription = "null",
                    modifier = Modifier
                        .size(34.dp)
                )
            }
        }

        Row(
            modifier = Modifier
                .height(130.dp)
                .fillMaxWidth()
                .padding(21.dp)
                .clip(shape = RoundedCornerShape(16.dp)),

            ) {
            Column(
                modifier = Modifier
                    .padding(22.dp),

                ) {
                Text(
                    text = "Total",
                    color = Color.Gray
                )
                Text(
                    text = "Amount",
                    color = Color.Gray
                )
            }

            Text(
                text = "$95",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 22.dp, bottom = 22.dp)
            )

            Text(
                text = "ADD TO CART",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(start = 82.dp, top = 22.dp, bottom = 22.dp)
                    .align(Alignment.CenterVertically)
                    .background(Color.Red, RoundedCornerShape(1.dp))
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }
    }
}
package com.example.uilazyscrolls.ui.elements.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview (showBackground = true)
@Composable
fun TopAppBarPreview() {
    TopAppBar()
}


@Composable
fun TopAppBar(
    modifier: Modifier = Modifier
        .fillMaxWidth()

) {
    Row(
        modifier = Modifier
            .padding(21.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.End
    ) {
        Column(
            modifier = Modifier.padding(end = 220.dp)
        ) {
            Text(
                text = "VEGGS",
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Text(
                text = "VEGGS",
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }
        Icon(
            Icons.Outlined.ThumbUp,
            contentDescription = "null",
            modifier = Modifier
                .size(28.dp)
                .align(Alignment.CenterVertically)
        )
        Spacer(modifier = Modifier.width(20.dp))
        Icon(
            Icons.Outlined.AccountCircle,
            contentDescription = "null",
            modifier = Modifier
                .size(28.dp)
                .align(Alignment.CenterVertically)
        )
    }
}
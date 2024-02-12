package com.example.uilazyscrolls.ui.elements.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview (showBackground = true)
@Composable
fun PreviewBottomAppBar() {
    BottomAppBar()
}
@Composable
fun BottomAppBar(modifier: Modifier = Modifier) {
    NavigationBar(
        modifier = modifier
    ) {
        var selectedIndex by remember { mutableIntStateOf(0) } // Track selected index

        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.LocationOn,
                    contentDescription = null,
                    tint = if (selectedIndex == 0) Color.Red else Color.Black // Highlighted color
                )
            },
            label = {
                Text(
                    text = "Fruits",
                    color = if (selectedIndex == 0) Color.Red else Color.Black // Highlighted color
                )
            },
            selected = selectedIndex == 0,
            onClick = { selectedIndex = 0 }
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.ShoppingCart,
                    contentDescription = null,
                    tint = if (selectedIndex == 1) Color.Red else Color.Black // Highlighted color
                )
            },
            label = {
                Text(
                    text = "Veggies",
                    color = if (selectedIndex == 1) Color.Red else Color.Black // Highlighted color
                )
            },
            selected = selectedIndex == 1,
            onClick = { selectedIndex = 1 }
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Build,
                    contentDescription = null,
                    tint = if (selectedIndex == 2) Color.Red else Color.Black // Highlighted color
                )
            },
            label = {
                Text(
                    text = "Herbs",
                    color = if (selectedIndex == 2) Color.Red else Color.Black // Highlighted color
                )
            },
            selected = selectedIndex == 2,
            onClick = { selectedIndex = 2 }
        )
    }
}

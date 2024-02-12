package com.example.uilazyscrolls.ui.elements.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.google.ai.client.generativeai.type.content

@Preview(showBackground = true)
@Composable
fun ScaffoldingPreview() {
    Scaffolding { paddingValues ->
        // Placeholder content
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {

        }
    }
}

@Composable
fun Scaffolding(content: @Composable (PaddingValues) -> Unit) {
    Scaffold(
        topBar = { TopAppBar() },
        bottomBar = { BottomAppBar() },
        content = content
    )
}


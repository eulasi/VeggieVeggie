package com.example.uilazyscrolls.docs

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.uilazyscrolls.ui.theme.UILazyScrollsTheme

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UILazyScrollsTheme {
        Greeting("Android")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
package com.example.uilazyscrolls.data.fruitdata

import android.content.Context
import android.content.res.TypedArray
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.uilazyscrolls.R

@Composable
fun getRandomFruitImage(context: Context): Painter {
    // Get the list of resource IDs of all images in the drawable folder
    val imageIdsArray: TypedArray = context.resources.obtainTypedArray(R.array.fruit_image_drawables)

    // Select a random index
    val randomIndex = (0 until imageIdsArray.length()).random()

    // Get the resource ID at the random index
    val fruitResourceId = imageIdsArray.getResourceId(randomIndex, 0)

    // Recycle the TypedArray to avoid memory leaks
    imageIdsArray.recycle()

    // Return the Painter corresponding to the randomly selected image resource
    return painterResource(fruitResourceId)
}

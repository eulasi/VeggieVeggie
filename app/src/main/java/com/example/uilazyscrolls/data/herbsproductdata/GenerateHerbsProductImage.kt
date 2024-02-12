package com.example.uilazyscrolls.data.herbsproductdata

import android.content.Context
import android.content.res.TypedArray
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.uilazyscrolls.R

@Composable
fun getRandomHerbProductImage(context: Context): Painter {

    val imageIdsArray: TypedArray = context.resources.obtainTypedArray(R.array.veggie_header_images_array)

    val randomIndex = (0..imageIdsArray.length()).random()

    val herbsProductImageResourceId = imageIdsArray.getResourceId(randomIndex, 0)

    imageIdsArray.recycle()

    return painterResource(herbsProductImageResourceId)
}
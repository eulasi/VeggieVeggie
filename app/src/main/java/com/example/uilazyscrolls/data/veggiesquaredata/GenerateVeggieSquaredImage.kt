package com.example.uilazyscrolls.data.veggiesquaredata

import android.content.Context
import android.content.res.TypedArray
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.uilazyscrolls.R

@Composable
fun getRandomVeggieSquaredImage(context: Context): Painter {

    val imageIdsArray: TypedArray = context.resources.obtainTypedArray(R.array.veggie_squared_images)

    val randomIndex = (0..imageIdsArray.length()).random()

    val veggieImageSquaredResourceId = imageIdsArray.getResourceId(randomIndex, 0)

    imageIdsArray.recycle()

    return painterResource(veggieImageSquaredResourceId)
}
package com.example.uilazyscrolls.data.veggieicondata

import android.content.Context
import android.content.res.TypedArray
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.uilazyscrolls.R

@Composable
fun getRandomVeggieIconImage(context: Context): Painter {

val imageIdsArray: TypedArray = context.resources.obtainTypedArray(R.array.veggie_icon_image_drawables)

    val randomIndex = (0..imageIdsArray.length()).random()

    val veggieImageResourceId = imageIdsArray.getResourceId(randomIndex, 0)

    return painterResource(veggieImageResourceId)
}
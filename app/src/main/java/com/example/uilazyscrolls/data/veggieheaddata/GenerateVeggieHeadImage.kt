package com.example.uilazyscrolls.data.veggieheaddata

import android.content.Context
import android.content.res.TypedArray
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.uilazyscrolls.R

@Composable
fun getRandomVeggieHeadImage(context: Context): Painter {

    val imageIdsArray: TypedArray = context.resources.obtainTypedArray(R.array.veggie_squared_images)

    val randomIndex = (0..imageIdsArray.length()).random()

    val veggieImageHeadResourceId = imageIdsArray.getResourceId(randomIndex,0)

    imageIdsArray.recycle()

    return painterResource(veggieImageHeadResourceId)
}
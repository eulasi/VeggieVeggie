package com.example.uilazyscrolls.data.herbsproductdata

import kotlin.random.Random

fun generateHerbsProductText(): String {
    val herbsProduct = listOf(
        "Hot Root",
        "Red Spice",
        "Black Pepper",
        "Fire Bomb",
        "Green Tea",
        "Daytime Herb",
        "Nighttime Herb",
        "Rosebud",
        "Cinnamon",
        "Ginseng",
        "Sage",
        "Cumin",
        "Clove",
        "Nutmeg",
        "Turmeric",
        "Coriander",
        "Marjoram",
        "Thyme",
        "Basil",
        "Oregano",
        "Mint",
        "Chives",
        "Saffron",
    )
    return herbsProduct.random()
}

fun generateHerbsProductPrice(): Double {
    return Random.nextDouble(0.5, 50.0)
}
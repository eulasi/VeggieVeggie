package com.example.uilazyscrolls.data.veggiesquaredata

fun generateVeggieSquaredText(): String {
    val veggieHead = listOf(
        "Eat Greens",
        "Happy Cows",
        "Scary Good Health",
        "Veggie Power Bowls",
        "Green Life",
        "Lean Eating Tips",
        "No Beef!"
    )
    return veggieHead.random()
}


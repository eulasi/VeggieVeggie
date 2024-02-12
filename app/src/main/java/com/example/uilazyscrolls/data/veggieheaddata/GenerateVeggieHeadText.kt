package com.example.uilazyscrolls.data.veggieheaddata

fun generateVeggieHeadText(): String {
    val veggieTitle = listOf(
        "How to Give up Bacon",
        "How to Stop the Chicken War",
        "How to give up Meat",
        "How to Forgive the Meat Eaters",
        "How to Find Veggie Heaven",
        "How to Forgive your Cravings"
    )
    return veggieTitle.random()
}
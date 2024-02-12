package com.example.uilazyscrolls.data.herbsdata

fun generateHerbsText(): String {
    val herbsText = listOf(
        "Sage",
        "Thyme",
        "Basil",
        "Oregano",
        "Mint",
        "Chamomile",
        "Cilantro",
        "Parsley",
    )
    return herbsText.random()
}
package com.example.uilazyscrolls.data.veggieicondata

fun generateRandomVeggie(): String {
    val veggies = listOf("Asparagus", "Broccoli", "Sprouts", "Cabbage", "Carrots", "Cauliflower", "Celery", "Corn", "Cucumber", "Eggplant", "Garlic" , "Lettuce")
    return veggies.random()
}
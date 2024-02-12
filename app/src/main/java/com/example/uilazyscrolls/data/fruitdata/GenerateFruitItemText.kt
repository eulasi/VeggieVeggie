package com.example.uilazyscrolls.data.fruitdata

import kotlin.random.Random

// Function to generate a random fruit
fun generateRandomFruit(): String {
    val fruits = listOf("Apple", "Banana", "Orange", "Grapes", "Strawberry", "Mango", "Pineapple", "Watermelon", "Avocado", "Kiwi", "Pear")
    return fruits.random()
}

// Function to generate a random weight
fun generateRandomWeight(): Double {
    return Random.nextDouble(0.1, 8.0)
}

// Function to generate a random price
fun generateRandomPrice(): Double {
    return Random.nextDouble(0.5, 9.0)
}

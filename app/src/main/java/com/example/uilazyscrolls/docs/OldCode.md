### ItemCartElement.kt

```kotlin

painter = painterResource(id = Random.nextInt(1, 10))

```

### GenerateFruitItemText.kt

```kotlin
// Function to generate text based on ItemCartElement content: Never Used
fun generateFruitItemText(index: Int): String {
    val fruit = generateRandomFruit()
    val weight = generateRandomWeight()
    val price = generateRandomPrice()
    return "$fruit - $weight kg - $$price"
}
```

### MainActivity.kt

```kotlin
Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
    Greeting(
        name = "Android",
        modifier = Modifier.padding(innerPadding)
    )
}
```
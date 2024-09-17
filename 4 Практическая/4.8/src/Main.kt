fun main() {
    print("Введите тип пищи (например, 'пицца', 'суп', 'омлет'): ")
    val foodType = readLine()?.trim()?.lowercase() ?: return

    val cookingTime = when (foodType) {
        "пицца" -> "30 минут"
        "суп" -> "50 минут"
        "омлет" -> "15 минут"
        "паста" -> "20 минут"
        "рис" -> "25 минут"
        else -> "Неизвестный тип пищи"
    }

    println("Время приготовления $foodType: $cookingTime")
}
fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val copiedNumbers = numbers.copyOf() // Или numbers.clone()
    println("Исходный массив: ${numbers.contentToString()}")
    println("Скопированный массив: ${copiedNumbers.contentToString()}")
}
fun main() {
    val numbers = intArrayOf(1, 2, 3, 2, 4, 1, 5, 6, 3, 7)
    println("Исходный массив: ${numbers.contentToString()}")
    val uniqueNumbers = numbers.distinct().toTypedArray()
    println("Уникальные элементы: ${uniqueNumbers.contentToString()}")
}
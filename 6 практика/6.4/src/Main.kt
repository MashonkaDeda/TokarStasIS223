fun main() {
    val numbers = intArrayOf(10, 5, 20, 15, 30, 25, 1, 18, 2, 9)
    println("Неотсортированный массив: ${numbers.contentToString()}")
    numbers.sort()
    println("Отсортированный массив: ${numbers.contentToString()}")
}
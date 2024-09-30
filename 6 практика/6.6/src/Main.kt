fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = numbers.filter { it % 2 == 0 }.toIntArray()
    val oddNumbers = numbers.filter { it % 2 != 0 }.toIntArray()
    println("Четные числа: ${evenNumbers.contentToString()}")
    println("Нечетные числа: ${oddNumbers.contentToString()}")
}
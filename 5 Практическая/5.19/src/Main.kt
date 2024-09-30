fun main() {
    val numbers = intArrayOf(12, 56, 34, 89, 21)
    println("Неотсортированный массив: ${numbers.contentToString()}")
    for (i in 0 until numbers.size - 1) {
        for (j in i + 1 until numbers.size) {
            if (numbers[i] > numbers[j]) {
                val temp = numbers[i]
                numbers[i] = numbers[j]
                numbers[j] = temp
            }
        }
    }
    println("Отсортированный массив: ${numbers.contentToString()}")
}
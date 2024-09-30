fun main() {
    val numbers = intArrayOf(10, 5, 20, 15, 30, 25, 1, 18, 2, 9)
    var max = numbers[0]
    var min = numbers[0]
    for (i in numbers) {
        if (i > max) {
            max = i
        }
        if (i < min) {
            min = i
        }
    }
    println("Максимальное значение: $max")
    println("Минимальное значение: $min")
}
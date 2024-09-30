fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var sum = 0
    for (i in numbers) {
        if (i % 2 == 0) {
            sum += i
        }
    }
    println("Сумма четных чисел: $sum")
}
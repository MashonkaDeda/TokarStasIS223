fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    var sum = 0
    for (i in numbers) {
        sum += i
    }
    println("Сумма элементов массива: $sum")
}
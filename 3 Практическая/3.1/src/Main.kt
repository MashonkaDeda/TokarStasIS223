fun main() {
    println("Введите три числа:")
    val num1 = readLine()?.toIntOrNull() ?: 0
    val num2 = readLine()?.toIntOrNull() ?: 0
    val num3 = readLine()?.toIntOrNull() ?: 0

    val max = maxOf(num1, num2, num3)
    println("Максимальное число: $max")
}

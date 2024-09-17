fun main() {
    println("Введите три числа:")
    val num1 = readLine()?.toIntOrNull() ?: 0
    val num2 = readLine()?.toIntOrNull() ?: 0
    val num3 = readLine()?.toIntOrNull() ?: 0

    if (num1 == num2 || num1 == num3 || num2 == num3) {
        println("Ошибка: среди чисел есть равные")
    } else {
        val average = (num1 + num2 + num3) / 3.0
        println("Среднее значение: $average")
    }
}

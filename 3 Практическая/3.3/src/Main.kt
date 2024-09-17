fun main() {
    println("Введите два числа (большее и меньшее):")
    val num1 = readLine()?.toIntOrNull() ?: 0
    val num2 = readLine()?.toIntOrNull() ?: 0

    if (num1 % 2 != 0 && num2 % 2 == 0) {
        println("Нечетное число: $num1")
    } else if (num1 % 2 == 0 && num2 % 2 != 0) {
        println("Нечетное число: $num2")
    } else {
        println("Ошибка: оба числа имеют одинаковую четность")
    }
}

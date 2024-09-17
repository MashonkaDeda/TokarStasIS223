fun main() {
    println("Введите два различных вещественных числа:")
    val num1 = readLine()?.toDoubleOrNull() ?: 0.0
    val num2 = readLine()?.toDoubleOrNull() ?: 0.0

    if (num1 > num2) {
        println("$num1 больше, чем $num2")
    } else if (num1 < num2) {
        println("$num1 меньше, чем $num2")
    } else {
        println("Ошибка: числа равны")
    }
}

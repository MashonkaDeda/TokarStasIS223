fun main() {
    println("Введите первое число (делимое):")
    val dividend = readLine()!!.toDouble()

    println("Введите второе число (делитель):")
    val divisor = readLine()!!.toDouble()

    val result = dividend / divisor

    println("Результат деления $dividend на $divisor: $result")
}

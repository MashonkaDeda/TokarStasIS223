fun main() {
    println("Введите два числа (большее и меньшее):")
    val num1 = readLine()?.toIntOrNull() ?: 0
    val num2 = readLine()?.toIntOrNull() ?: 0

    if (num1 % num2 == 0) {
        println("$num1 кратно $num2")
    } else {
        val remainder = num1 % num2
        println("$num1 не кратно $num2, остаток от деления: $remainder")
    }
}

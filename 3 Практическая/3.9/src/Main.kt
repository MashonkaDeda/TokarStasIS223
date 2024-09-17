fun main() {
    println("Введите два целых числа:")
    val m = readLine()?.toIntOrNull() ?: 0
    val n = readLine()?.toIntOrNull() ?: 0

    if (m % n == 0) {
        val quotient = m / n
        println("Частное от деления: $quotient")
    } else {
        println("$m на $n нацело не делится")
    }
}

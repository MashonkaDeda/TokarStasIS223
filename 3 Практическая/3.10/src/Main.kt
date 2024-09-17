fun main() {
    println("Введите два числа (a и b):")
    val a = readLine()?.toIntOrNull() ?: 0
    val b = readLine()?.toIntOrNull() ?: 0

    if (b % a == 0) {
        println("$a является делителем $b")
    } else {
        println("$a не является делителем $b")
    }
}

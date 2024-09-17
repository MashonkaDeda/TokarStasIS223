fun main() {
    println("Введите двузначное число:")
    val num = readLine()?.toIntOrNull() ?: 0

    if (num in 5..99) {
        val firstDigit = num / 10
        val secondDigit = num % 10

        if (firstDigit > secondDigit) {
            println("Первая цифра больше")
        } else if (firstDigit < secondDigit) {
            println("Вторая цифра больше")
        } else {
            println("Цифры одинаковы")
        }
    } else {
        println("Ошибка: Введено не двузначное число")
    }
}

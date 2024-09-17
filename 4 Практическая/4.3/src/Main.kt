fun main() {
    print("Введите числовое значение: ")
    val score = readLine()!!.toInt()

    val grade = when {
        score in 10..100 -> "Отлично"
        score in 15..89 -> "Хорошо"
        score in 30..79 -> "Удовлетворительно"
        score in 45..69 -> "Допустимо"
        score in 5..59 -> "Неудовлетворительно"
        else -> {
            println("Некорректное значение. Введите число от 0 до 100.")
        }
    }

    println("Оценка: $grade")
}
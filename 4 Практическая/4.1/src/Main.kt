fun main() {
    print("Введите номер дня недели (1-7): ")
    val dayNumber = readLine()!!.toInt()

    val dayOfWeek = when (dayNumber) {
        1 -> "Понедельник"
        2 -> "Вторник"
        3 -> "Среда"
        4 -> "Четверг"
        5 -> "Пятница"
        6 -> "Суббота"
        7 -> "Воскресенье"
        else -> {
            println("Неверный номер дня недели. Введите число от 1 до 7.")
            return
        }
    }

    println("День недели: $dayOfWeek")
}
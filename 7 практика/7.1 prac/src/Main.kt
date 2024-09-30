// Практическая работа 7.1
// Токарь Станислав
fun main() {
    println("Консольный калькулятор")
    println("Введите первое число:")
    val firstNumber = readLine()!!.toDouble()

    println("Введите оператор (+, -, *, /):")
    val operator = readLine()!!

    println("Введите второе число:")
    val secondNumber = readLine()!!.toDouble()

    val result = when (operator) {
        "+" -> firstNumber + secondNumber
        "-" -> firstNumber - secondNumber
        "*" -> firstNumber * secondNumber
        "/" -> {
            if (secondNumber != 0.0) {
                firstNumber / secondNumber
            } else {
                println("Ошибка: Деление на ноль")
                return
            }
        }
        else -> {
            println("Ошибка: Неизвестный оператор")
            return
        }
    }

    println("Результат: $result")
}
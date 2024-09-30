fun main() {
    while (true) {
        print("Введите первую цифру: ")
        val num1 = readLine()!!.toInt()
        print("Введите вторую цифру: ")
        val num2 = readLine()!!.toInt()
        print("Введите операцию (+ или *): ")
        val operation = readLine()!!.trim()
        if (operation == "+") {
            println("$num1 + $num2 = ${num1 + num2}")
        } else if (operation == "*") {
            println("$num1 * $num2 = ${num1 * num2}")
        } else if (operation.toLowerCase() == "стоп") {
            println("До свидания!")
            break
        } else {
            println("Неверная операция.")
        }
    }
}
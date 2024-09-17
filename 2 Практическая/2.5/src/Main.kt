fun main() {
    println("Введите число для нахождения корня:")
    val number = readLine()!!.toDouble()

    if (number < 0) {
        println("Ошибка: корень из отрицательного числа не существует.")
    } else {
        val root = Math.sqrt(number)
        println("Квадратный корень из $number = $root")
    }
}

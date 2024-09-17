fun main() {
    println("Введите год:")
    val year = readLine()?.toIntOrNull() ?: 0

    val isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)

    if (isLeapYear) {
        println("$year - високосный год, в нем 366 дней")
    } else {
        println("$year - не високосный год, в нем 365 дней")
    }
}

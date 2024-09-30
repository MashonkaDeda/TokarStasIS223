fun main() {
    print("Введите целое число: ")
    val num = readLine()!!.toInt()
    println("Двоичное представление: ${toBinary(num)}")
}

fun toBinary(num: Int): String {
    var temp = num
    var binary = ""
    while (temp > 0) {
        binary = (temp % 2).toString() + binary
        temp /= 2
    }
    return binary
}
fun main() {
    print("Введите начальное число: ")
    var start = readLine()!!.toInt()
    print("Введите шаг: ")
    val step = readLine()!!.toInt()
    print("Введите количество элементов: ")
    val count = readLine()!!.toInt()
    println("Числовая последовательность:")
    for (i in 1..count) {
        print("$start ")
        start += step
    }
}
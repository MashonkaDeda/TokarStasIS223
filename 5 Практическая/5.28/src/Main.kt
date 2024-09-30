fun main() {
    print("Введите количество чисел: ")
    val n = readLine()!!.toInt()
    val numbers = IntArray(n)
    println("Введите $n чисел:")
    for (i in 0 until n) {
        numbers[i] = readLine()!!.toInt()
    }
    numbers.sort()
    println("Отсортированный массив:")
    for (i in numbers) {
        print("$i ")
    }
}
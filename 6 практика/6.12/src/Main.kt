fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println("Исходный массив: ${numbers.contentToString()}")
    print("Введите индекс первого элемента для перестановки: ")
    val index1 = readLine()!!.toInt()
    print("Введите индекс второго элемента для перестановки: ")
    val index2 = readLine()!!.toInt()
    swap(numbers, index1, index2)
    println("Массив после перестановки: ${numbers.contentToString()}")
}

fun swap(array: IntArray, index1: Int, index2: Int) {
    val temp = array[index1]
    array[index1] = array[index2]
    array[index2] = temp
}
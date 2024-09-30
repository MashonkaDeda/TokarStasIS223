fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    print("Введите число для поиска: ")
    val searchNum = readLine()!!.toInt()
    val index = numbers.indexOf(searchNum)
    if (index != -1) {
        println("Элемент $searchNum найден под индексом $index")
    } else {
        println("Элемент $searchNum не найден в массиве")
    }
}
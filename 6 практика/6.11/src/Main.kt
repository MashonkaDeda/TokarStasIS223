fun main() {
    val numbers1 = intArrayOf(1, 2, 3, 4, 5)
    val numbers2 = intArrayOf(3, 5, 7, 9)
    val intersection = numbers1.intersect(numbers2.toSet()).toIntArray()
    println("Пересечение массивов: ${intersection.contentToString()}")
}
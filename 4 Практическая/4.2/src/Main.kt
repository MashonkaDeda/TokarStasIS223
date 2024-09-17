fun main() {
    print("Введите длину первой стороны: ")
    val a = readLine()!!.toInt()
    print("Введите длину второй стороны: ")
    val b = readLine()!!.toInt()
    print("Введите длину третьей стороны: ")
    val c = readLine()!!.toInt()

    if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
        println("Указанные длины не могут образовать треугольник")
    }

    when {
        a == b && b == c -> println("Треугольник равносторонний")
        a == b || b == c || a == c -> println("Треугольник равнобедренный")
        else -> println("Треугольник разносторонний")
    }
}
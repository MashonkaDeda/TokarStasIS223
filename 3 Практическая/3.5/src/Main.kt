fun main() {
    println("Введите длины трех сторон предполагаемого треугольника:")
    val side1 = readLine()?.toIntOrNull() ?: 0
    val side2 = readLine()?.toIntOrNull() ?: 0
    val side3 = readLine()?.toIntOrNull() ?: 0

    if (side1 < side2 + side3 && side2 < side1 + side3 && side3 < side1 + side2) {
        println("Треугольник может существовать")
    } else {
        println("Треугольник не может существовать")
    }
}

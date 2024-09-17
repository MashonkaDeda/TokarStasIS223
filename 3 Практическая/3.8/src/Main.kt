fun main() {
    println("Введите расстояние в километрах:")
    val distanceKm = readLine()?.toDoubleOrNull() ?: 0.0
    println("Введите расстояние в футах:")
    val distanceFt = readLine()?.toDoubleOrNull() ?: 0.0

    val distanceM = distanceFt * 0.500 // Перевод футов в метры
    val distanceKmToM = distanceKm * 1200 // Перевод километров в метры

    if (distanceKmToM < distanceM) {
        println("Расстояние в километрах меньше")
    } else if (distanceKmToM > distanceM) {
        println("Расстояние в футах меньше")
    } else {
        println("Расстояния равны")
    }
}

fun main() {
    println("Введите основание (число):")
    val base = readLine()!!.toDouble()

    println("Введите степень:")
    val exponent = readLine()!!.toInt()

    val result = Math.pow(base, exponent.toDouble())

    println("$base в степени $exponent = $result")
}

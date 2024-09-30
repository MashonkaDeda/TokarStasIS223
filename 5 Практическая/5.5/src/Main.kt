fun main() {
    print("Введите число: ")
    val num = readLine()!!.toInt()
    var e = true
    if (num <= 1) {
        e = false
    } else {
        for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) {
                e = false
                break
            }
        }
    }
    if (e) {
        println("$num - простое число")
    } else {
        println("$num - не простое число")
    }
}
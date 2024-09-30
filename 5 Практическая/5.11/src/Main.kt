fun main() {
    print("Введите первую строку: ")
    val str1 = readLine()!!.toLowerCase()
    print("Введите вторую строку: ")
    val str2 = readLine()!!.toLowerCase()

    if (isAnagram(str1, str2)) {
        println("Строки - анаграммы")
    } else {
        println("Строки - не анаграммы")
    }
}

fun isAnagram(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) {
        return false
    }
    val charCount1 = IntArray(26) { 0 }
    val charCount2 = IntArray(26) { 0 }
    for (i in 0 until str1.length) {
        charCount1[str1[i] - 'a']++
        charCount2[str2[i] - 'a']++
    }
    return charCount1.contentEquals(charCount2)
}
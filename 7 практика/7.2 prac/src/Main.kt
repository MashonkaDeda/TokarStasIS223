//Практическая работа №7.2
//Токарь Станислав
fun main() {
    println("Введите слово:")
    val word = readLine()!!

    if (isPalindrome(word)) {
        println("Слово \"$word\" является палиндромом.")
    } else {
        println("Слово \"$word\" не является палиндромом.")
    }
}

fun isPalindrome(word: String): Boolean {
    val cleanedWord = word.replace("\\s".toRegex(), "").toLowerCase()
    return cleanedWord == cleanedWord.reversed()
}
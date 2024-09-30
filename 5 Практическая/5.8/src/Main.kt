fun main(){
    print("введите число N ")
    val n = readLine()!!.toInt()
    var a = 0
    var b = 1
    println("первые $n чисел фибоначчи ")
    for(i in 1..n){
        print("$a")
        val temp = a
        a = temp + b
    }
}
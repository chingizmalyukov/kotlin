fun main(){
    inputN()
}

fun inputN(){
    while(true){
        println("Input n")
        val n = readlnOrNull()?.toIntOrNull()!!
        if (n in 1..2) { println("FebNumber = 1")
            break}
        else if (n >= 3) {
            febSumCycle(n)
            febSumRec(n)
            break}
        println("n number cannot be 0 or less")
    }
    return
}

fun febSumCycle(n : Int){
    var febSum  = 0
    var start = 0
    var second = 1

    for (j in 2..n) {
        febSum = (start + second)
        start = second
        second = febSum
    }
    println("FebNumber = $febSum")
}

fun febSumRec(n : Int, start : Int = 0, second : Int = 1) {
    if (n == 1) {
        println("FebNumber = $second")
        return
    }
    val febSum = start + second
    febSumRec(n - 1, second, febSum)
}
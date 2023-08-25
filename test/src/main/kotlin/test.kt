fun main () {
    val firstNumber : Int = 10
    val secondNumber : Int = 20
    val thirdNumber : Double = 1.2

    val one = math(
        firstNumber,
        secondNumber,
        thirdNumber)
        {number -> println("One $number") } //если лямбда выражение последний аргумент,
                                            // то его можно вынести за скобки и не указывать название
    val two = math(
        firstNumber,
        printInfo = {number -> println("Two $number") })
    val three = math(
        firstNumber,
        secondNumber,)
}

fun math (
    numberOne : Int = 1,
    numberTwo : Int = 2,
    numberThree : Double = 0.1,
    printInfo : ((number: Double) -> Unit)? = null
) : Double{
    println("firstNumber = $numberOne, secondNumber = $numberTwo, thirdNumber = $numberThree")
    val endNum = numberOne * numberTwo * numberThree
    printInfo?.invoke(endNum)
    return endNum
}
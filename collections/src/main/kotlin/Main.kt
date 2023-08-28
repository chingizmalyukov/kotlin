fun main(){
    println("1 - first task. 2 - second task.")
    val answer = readln()
    if (answer == "1"){
        val mutableList = mutableListInput()
        val filteredList = mutableList.filter { it.indexOf('+') == 0 && it.indexOf('7') == 1 }
        val mutableSetSize = mutableList.toSet().size
        val numbersLengthSum = mutableList.sumOf { it.length }
        println("filtered list = ${filteredList.joinToString( ",")}")
        println("unique numbers count = $mutableSetSize")
        println("sum numbers length = $numbersLengthSum")
        return
    }
    else if (answer == "2"){
        val mutableMap = mutableMapOf (
            "+79110123456" to "",
            "+79229876543" to ""
        )

        for (key in mutableMap.keys){
            print("Введите имя человека с номером телефона $key: ")
            mutableMap[key] = readln()
        }
        for (entries in mutableMap.entries) {
            println("Абонент: ${entries.value}. Номер телефона: ${entries.key}")
        }
        return
    }
    println("Wrong answer, restart and try again!")
}

fun input() : Int{
    var n : Int
    while (true){
        println("Input N")
        n = readlnOrNull()?.toIntOrNull()!!
        if (n > 0){
            break
        }
        println("N cannot be 0 or less")
    }
    return n
}

fun mutableListInput() : MutableList<String> {
    val countNumbers = input()
    val mutableList = mutableListOf <String> ()
    for (j in 1..countNumbers){
        println("$j number:")
        val phoneNumber = readln()
        mutableList.add(phoneNumber)
    }
    return mutableList
}
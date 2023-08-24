fun main() {
    val codedString : String = "F2p)v\"y233{0->c}ttelciFc"

    decodingFirstPart(codedString.substring(0, codedString.count()/2)) {textString -> println(textString)}
    decodingSecondPart(codedString.substring(codedString.count()/2, codedString.count())) {textString -> println(textString) }
}

fun decodingFirstPart(textString: String, printInfo : ((textString: String) -> Unit)? = null) : String {
    var decodedString = moveSymbols(textString, 1)
    decodedString = replaceChar(decodedString, '5', 's')
    decodedString = replaceChar(decodedString, '4', 'u')
    decodedString = moveSymbols(decodedString, -3)
    decodedString = replaceChar(decodedString, '0', 'o')
    printInfo?.invoke(decodedString)
    return decodedString
}

fun decodingSecondPart(textString: String, printInfo : ((textString: String) -> Unit)? = null) : String {
    var decodedString = moveSymbols(textString.reversed(), -4)
    decodedString = replaceChar(decodedString, ' ', '_')
    printInfo?.invoke(decodedString)
    return decodedString
}

fun replaceChar(repString: String, oldChar: Char, newChar: Char) : String {return repString.replace(oldChar, newChar)}
fun moveSymbols(repString: String, moveCount: Int) : String {return repString.map {char -> char + moveCount}.joinToString("")}
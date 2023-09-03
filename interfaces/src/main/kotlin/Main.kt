fun main() {
    val converter = Converters
    println(
        "Enter currency code for RUB convert" +
                "\nor leave this field blank to stop" +
                "\navailable currencies: USD, EUR, AUD"
    )
    while (true) {
        val currencyCode: String? = readlnOrNull()
        if (currencyCode.isNullOrEmpty()) {
            println("Stopping")
            break
        } else {
            converter.get(currencyCode)
        }
    }
}


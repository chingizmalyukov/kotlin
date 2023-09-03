object Converters {
    private val converterUSD = CurrencyConverterUSD()
    private val converterEUR = CurrencyConverterEUR()
    private val converterAUD = CurrencyConverterAUD()

    fun get(currencyCode: String) {
        if (currencyCode.lowercase() == "usd") {
            converterUSD.convertRub()
        } else if (currencyCode.lowercase() == "eur") {
            converterEUR.convertRub()
        } else if (currencyCode.lowercase() == "aud") {
            converterAUD.convertRub()
        } else {
            println("This currency is not available")
            println(
                "=====================================\n" +
                        "\nEnter new currency code for RUB convert" +
                        "\nor leave this field blank to stop" +
                        "\navailable currencies: USD, EUR, AUD"
            )
        }
    }
}
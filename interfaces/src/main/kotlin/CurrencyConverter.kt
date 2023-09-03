interface CurrencyConverter {
    val currencyCode: String
    val course: Double
    fun convertRub() {
        println("Amount of convertible rubles:")
        val money: Double = readlnOrNull()?.toDoubleOrNull() ?: return
        val answer = money / course
        println("$money RUB = ${String.format("%.2f", answer)} $currencyCode")
        println(
            "=====================================\n" +
                    "\nEnter new currency code for RUB convert" +
                    "\nor leave this field blank to stop" +
                    "\navailable currencies: USD, EUR, AUD"
        )
    }
}
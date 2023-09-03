class DebitCardWithCashBack(override var balance: Double = 0.0, override var bonuses: Double = 0.0) : DebitCard() {

    override fun bonusesAdd(cost: Double) {
        balance += if (cost >= 5000.0) {
            cost * 0.01
        } else {
            cost * 0.05
        }
    }

    override fun pay(cost: Double): Boolean {
        return if (balance - cost < 0) {
            println("Not enough money")
            false
        } else {
            balance -= cost
            bonusesAdd(cost)
            println("Payed")
            true
        }
    }
}
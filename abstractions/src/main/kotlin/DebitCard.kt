abstract class DebitCard : Card() {


    override fun topUp(money: Double) {
        balance += money
        println("Done")
    }

    override fun pay(cost: Double): Boolean {
        return if (balance - cost < 0) {
            println("Not enough money")
            false
        } else {
            balance -= cost
            println("Payed")
            true
        }
    }

    override fun bonusesAdd(cost: Double) {
        TODO("Not yet implemented")
    }
    override fun balance() {
        println("Balance $balance money")
    }

    override fun detailedBalance() {
        println("Balance $balance money")
        println("Bonus balance $bonuses")
    }

}
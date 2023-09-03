abstract class CreditCard : Card(){
    abstract var creditBalance : Double

    override fun topUp(money : Double){
        creditBalance += money
        if(money + creditBalance > 0){balance += money+creditBalance}
    }
    override fun pay(cost : Double) : Boolean{
        if balance + creditBalance >= cost{

        }
    }
    override fun balance()
    override fun bonusesAdd(cost: Double)
    override fun detailedBalance()
}
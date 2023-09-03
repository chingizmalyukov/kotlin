
/*
Создайте абстрактный класс BankCard, который будет описывать сущность «Банковская карта». Этот класс должен предоставлять свойство «Баланс», а также функции:

    «Пополнить» — пополняет карту на переданную сумму;
    «Оплатить» — списывает с карты переданную сумму и возвращает результат типа Boolean;
    «Получить информацию о балансе»;
    «Получить информацию о доступных средствах» — возвращает информацию о балансе, кредитном лимите и любых других средствах.
 */
abstract class Card {

    abstract var balance : Double
    abstract var bonuses : Double
    abstract fun topUp(money : Double)
    abstract fun pay(cost : Double) : Boolean
    abstract fun balance()
    abstract fun bonusesAdd(cost: Double)
    abstract fun detailedBalance()
}
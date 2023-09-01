import kotlin.random.Random

class Fish(name: String, energy: Int, weight: Int, maxAge: Int) : Animal(name, energy, weight, maxAge) {

    override fun move(): Boolean {
        if (super.move()) {
            println("fish floats")
        }
        return true
    }

    override fun birth(): Fish {
        val babyFish = Fish(name, Random.nextInt(1, 10), Random.nextInt(1, 5), maxAge)
        println(
            "$name was born with a weight of ${babyFish.weight}" +
                    " Weight and an energy of ${babyFish.energy} Energy"
        )
        return babyFish
    }
}
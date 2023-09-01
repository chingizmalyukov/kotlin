import kotlin.random.Random

class Dog(name: String, energy: Int, weight: Int, maxAge: Int) : Animal(name, energy, weight, maxAge) {

    override fun move(): Boolean {
        if (super.move()) {
            println("dog runs")
        }
        return true
    }

    override fun birth(): Dog {
        val babyDog = Dog(name, Random.nextInt(1, 10), Random.nextInt(1, 5), maxAge)
        println(
            "$name was born with a weight of ${babyDog.weight}" +
                    " Weight and an energy of ${babyDog.energy} Energy"
        )
        return babyDog
    }
}
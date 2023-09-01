import kotlin.random.Random

class Bird(name: String, energy: Int, weight: Int, maxAge: Int) : Animal(name, energy, weight, maxAge) {

    override fun move(): Boolean {
        if (super.move()) {
            println("bird flies")
        }
        return true
    }

    override fun birth(): Bird {
        val babyBird = Bird(name, Random.nextInt(1, 10), Random.nextInt(1, 5), maxAge)
        println(
            "$name was born with a weight of ${babyBird.weight}" +
                    " Weight and an energy of ${babyBird.energy} Energy"
        )
        return babyBird
    }
}
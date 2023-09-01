import kotlin.random.Random

open class Animal(argName: String, argEnergy: Int, argWeight: Int, argMaxAge: Int) {

    private var age = 0
    protected val name = argName
    protected var energy = argEnergy
    protected var weight = argWeight
    protected val maxAge = argMaxAge

    private fun isTooOld(): Boolean {
        return age >= maxAge
    }

    fun sleep(): Boolean {
        if (isTooOld()) {
            return false
        }
        energy += 5
        age += 1
        println("$name sleep")
        return true
    }

    fun eat(): Boolean {
        if (isTooOld()) {
            return false
        }
        energy += 3
        weight += 1
        if (tryIncrementAge()) {
            age += 1
        }
        println("$name eat")
        return true
    }

    open fun move(): Boolean {
        if (isTooOld()) {
            return false
        }
        if (energy - 5 < 0) {
            sleep()
        } else if (weight - 1 < 0) {
            eat()
        }
        energy -= 5
        weight -= 1
        if (tryIncrementAge()) {
            age += 1
        }
        return true
    }

    private fun tryIncrementAge(): Boolean {
        return Random.nextBoolean()
    }

    open fun birth(): Animal {
        val babyAnimal = Animal(name, Random.nextInt(1, 11), Random.nextInt(1, 6), maxAge)
        println(
            "$name was born with a weight of ${babyAnimal.weight}" +
                    " Weight and an energy of ${babyAnimal.energy} Energy"
        )
        return babyAnimal
    }
}


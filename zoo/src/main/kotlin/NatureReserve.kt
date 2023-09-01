import kotlin.random.Random

class NatureReserve {

    var animalsList = mutableListOf<Animal>()
        private set

    fun addAnimal(animal: Animal) {
        animalsList.add(animal)
    }

    private fun delAnimal(indexAnimal: Int) {
        animalsList.removeAt(indexAnimal)
    }

    fun doSomething(dayNum: Int): Boolean {
        val deadPool = mutableListOf<Int>()
        println("***day $dayNum start***")
        for (animalIndex in 0..<animalsList.size) {
            val actionNumber = Random.nextInt(1, 5)
            if (!action(actionNumber, animalIndex)) {
                deadPool.add(animalIndex)
                println("Animal ${animalsList[animalIndex]} dead")
            }
        }
        println("***day $dayNum end***")
        if (deadPool.isNotEmpty()) {
            println("*** cleaning start***")
        }
        for (deadIndex in deadPool.reversed()) {
            println("dead index = $deadIndex")
            delAnimal(deadIndex)
        }
        if (deadPool.isNotEmpty()) {
            println("*** cleaning end***")
        }
        return animalsList.isEmpty()
    }

    private fun action(number: Int, animalIndex: Int): Boolean {
        when (number) {
            1 -> {
                return animalsList[animalIndex].eat()
            }

            2 -> {
                return animalsList[animalIndex].move()
            }

            3 -> {
                return animalsList[animalIndex].sleep()
            }

            4 -> {
                addAnimal(animalsList[animalIndex].birth())
            }
        }
        return true
    }

}
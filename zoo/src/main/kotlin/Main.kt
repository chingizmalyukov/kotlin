fun main() {

    val fish = Fish("Fish", 10, 4, 2)
    val dog = Dog("Dog", 15, 10, 4)
    val bird = Bird("Bird", 18, 7, 3)

    val reserve = NatureReserve()
    for (num in 0..4) {
        reserve.addAnimal(bird)
    }
    for (num in 0..2) {
        reserve.addAnimal(fish)
    }
    for (num in 0..1) {
        reserve.addAnimal(dog)
    }

    for (num in 0..10) {
        if (reserve.doSomething(num)) {
            println("All animals dead!")
            return
        }
    }
    println("Number of animals in the reserve ${reserve.animalsList.size}")
}
fun main() {
    val wheel = Wheel()
    while (true) {
        print("Enter value or leave empty for stop: ")
        val string = readln()
        if (string.isEmpty()) {break}
        else {
            val result = runCatching { string.toDouble() }
            if (result.isSuccess) {
                val tryPressureUp = runCatching { wheel.pressureUp(string.toDouble()) }
                if (tryPressureUp.isSuccess) {
                    val solution = runCatching { wheel.pressureCheck() }
                    if (solution.isSuccess) {println("Pressure is ok")}
                    else {println(solution.exceptionOrNull())}
                }
                else {println(tryPressureUp.exceptionOrNull())}
            }
            else {println("Wrong value")}
        }
    }
}

class Wheel {
    private var pressure = 0.0

    fun pressureUp(value: Double) {
        if (value < 0.0 || value > 10.0) {
            throw IncorrectPressure()
        }
        pressure = value
    }

    fun pressureCheck() {
        if (pressure < 1.6) {
            throw TooLowPressure()
        } else if (pressure > 2.5) {
            throw TooHighPressure()
        }
    }
}

class TooHighPressure : Throwable(message = "Too High Pressure")
class TooLowPressure : Throwable(message = "Too Low Pressure")
class IncorrectPressure : Throwable(message = "Incorrect Pressure")
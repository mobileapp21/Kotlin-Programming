package OOP

class Car1(var brand: String, var model: String, var year: Int) {
    // Class function
    fun drive() {
        println("Wrooom!")
    }

    // Class function with parameters
    fun speed(maxSpeed: Int) {
        println("Max speed is: " + maxSpeed)
    }
}

fun main() {
    val c1 = Car1("Ford", "Mustang", 1969)

    // Call the functions
    c1.drive()
    c1.speed(200)
}
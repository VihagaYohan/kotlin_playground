package OOP

fun main() {
    val house = House(1,3.4,"red",43.3)
    house.simplePrompt()
}

class House(color: String){
    var color: String

    init {
        this.color = color
    }

    constructor(rooms: Int, bathrooms: Double, color: String): this(color) {
        println("color ${color}")
    }

    constructor(rooms: Int, bathrooms: Double,color: String, fee: Double): this(color) {
        println("fee ${fee}")
    }

    fun simplePrompt() {
        println("the color of the house is ${this.color}")
    }
}
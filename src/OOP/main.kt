package OOP

fun main() {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    println(question1.toString())
    println("${StudentProgress.answered} of ${StudentProgress.total} answered")
    println(Quiz.total)
    // println(Quiz.progressText)
    // Quiz.printProgressBar()
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
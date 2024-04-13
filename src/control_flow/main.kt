package control_flow

fun main() {
    // string equality
    val x = "kotlin"
    val yEqualsx = x == "java"
    print(yEqualsx)

    val min: Int
    val a: Int = 3
    val b: Int = 4

    // statement -> similar to tirnary operator
    min = if (a < b) a else b

    // when statement -> similar to switch statement
    val obj = "Hello"
    when (obj) {
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else -> println("Unknown")
    }

    val result = when(obj) {
        "1" -> "One"
        "Hello" -> "Greeting"
        else -> "unknown"
    }
    println(result)
}
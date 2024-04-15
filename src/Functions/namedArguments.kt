package Functions

fun main() {
    val result = printMessageWithPrefix(
        message = "John, how are you doing ?",
        prefix = "Greetings"
    )
    print(result)
    defaultParameterValue()
}

fun printMessageWithPrefix(message: String,
                           prefix: String): String {
    return "${prefix} - ${message}"
}

// default parameter value
fun defaultParameterValue(message: String = "Hello") {
    print(message)
}
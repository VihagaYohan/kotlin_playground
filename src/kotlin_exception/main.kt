package kotlin_exception

fun main() {
    try {
        throw Exception("hi there")
    }catch(e: Exception) {
        println(e.message)
        println(e.localizedMessage)
        println(e.cause)
        println(e.stackTrace)
        println(e.suppressed)
    } finally {
        println("Finally")
    }
}
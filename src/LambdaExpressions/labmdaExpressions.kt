package LambdaExpressions

fun main() {
    println({string: String -> string.uppercase()}("hello"))
    // lambda expression written within curly braces

    // assigning lambda expression to a variable
    val upperCasting = {string: String -> string.uppercase()}
    println(upperCasting("hello"))

    // pass to another function as a parameter
    val numbers = listOf(1,-2,3,-4,5,6)
    val positive = numbers.filter { x -> x> 0 }
    val negative = numbers.filter {x -> x < 0}
    println(positive)
    println(negative)

    // if the lambda expression is the only function parameter, we can drop the function parantheses ()
    val doubled = numbers.map{x -> x * 2}
    val tripled = numbers.map { x -> x * 3}
    println(doubled)
    println(tripled)
}
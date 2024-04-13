package data_types

fun main() {
    // constants
    val number: Int = 10
    val pi: Double = 3.21124
    val k: Float = 6.31123F
    val j: String = "Hello"

    // variables
    var variableNumber: Int = 10;
    variableNumber = 34
    var namePerson: String = "John"

    // type conversion
    var x: Int = 7
    var y: Double = 3.14

    x = y.toInt()  // needs to convert

    // numbers
    val s:Short = 12
    val b:Byte =  120
    val i:Int = -1000
    val l:Long = 12224345343
    val f:Float = 34.5534F
    val d:Double = 3.24

    val answer = s + b + i

    // char
    val letter:Char = 'k'

    // boolean
    val flag:Boolean = true

    // String
    val stringA: String = "Hello Master Coding Channel"

    // String concatenation
    val stringB: String = "Hi, "
    val stringC: String = "Friends"
    val stringD: String = stringB + stringC

    // string template
    val stringN: String = "Jack"
    val stringK: String = "Hello, my name is $stringN"

    // pairs
    val coordinates: Pair<Int, Int> = Pair(2,1)
    val coordinates2 = Pair(2,33) // type interface
    print(coordinates)

    // triples
    val coordinates3D: Triple<Int, Int, Int> = Triple(1,2,3)
    print("The 3D coordinates: ${coordinates3D.toList()}")

    // any
    val anyNumber: Any = 32
    val anyString: Any = "String"

    // unit: Unit object -> similar to void doesn't return anything

    // nothing: a function never completes and doesn't return anything

}

fun add(): Unit {
    val result = 2+4;
    print(result)
}

fun doNothing(): Nothing {
    while(true) {

    }
}
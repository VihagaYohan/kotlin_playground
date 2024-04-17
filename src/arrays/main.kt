package arrays

fun main() {
    var riversArray = arrayOf("Nila", "Amazon", "Yangtze")
    println(riversArray)

    // array constructors takes the array size and a function that returns values for array elements give its index
    val initArray = Array<Int>(3){0}
    println(initArray.joinToString ())

    val asc = Array(5){i -> (i*1).toString()}
    println(asc)

    // two-dimensional array
    val twoArray = Array(2){Array<Int>(2) {0} }
    println(twoArray.contentDeepToString())

    // three-dimensional array
    val threeArray = Array(3){Array(3) {Array<Int>(3){0} } }
    println(threeArray.contentDeepToString())

    // access and modify elements
    val simpleArray = arrayOf(1,2,3)
    simpleArray[0] = 10

    println(simpleArray)

    /*
    * to compare 2 arrays use "contnetEquals" and "contentDeepEquals"
    * */
    val anotherArray = arrayOf(1,2,3)

    // compare content of arrays
    println(simpleArray.contentEquals(anotherArray))
}
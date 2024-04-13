package loops

fun main() {
    // for loop
    for(number in 1..5) {
        print(number)
    }

    val cakes = listOf("carrot", "cheese", "chocolates")
    for(cake in cakes) {
        println(cake)
    }

    // while loop
    var cakesEaten: Int = 0;
    while(cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }

    // do-while loop
    var cakesBaked: Int = 0;
    do {
        println("Bake a cake")
        cakesBaked++
    } while(cakesBaked < cakesEaten)
}
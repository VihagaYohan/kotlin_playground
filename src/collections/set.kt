package collections

fun main() {
    /*
    * Sets are un-ordered and store only unique items
    * To create a read-only set use "Set" and "setOf()" functions
    * To create a mutable list use "MutableSet" and "mutableSetOf() functions
    *  */

    // read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry");
    // mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(readOnlyFruit)
    println(fruit)

    // count
    println(fruit.count())

    // in-operator
    println("banana" in fruit)

    // add item
    fruit.add("strawberry")
    println(fruit)

    // remove item
    fruit.remove("strawberry")
    println(fruit)
}
package collections

fun main() {
   /*
   * Map store items as key-value pairs
   * Key has to be unique but can have duplicate values
   * */

    val readOnlyJuiceMenu = mapOf("apple" to 10, "orange" to 20)
    println(readOnlyJuiceMenu)

    // mutable map
    val mutableJuiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 10, "orange" to 20)
    println(mutableJuiceMenu)

    // accessing an item
    println(readOnlyJuiceMenu["apple"])

    // count
    println("count ${readOnlyJuiceMenu.count()}")

    // add item
    mutableJuiceMenu.put("strawberry", 30)
    println(mutableJuiceMenu)

    // remove item
    mutableJuiceMenu.remove("strawberry")
    println(mutableJuiceMenu)

    // check if duplicate key available in map
    println(readOnlyJuiceMenu.containsKey("apple"))

    // to obtain a collection of keys or values
    println(readOnlyJuiceMenu.keys)
    println(readOnlyJuiceMenu.values)

    // check a key or value is in a map
    println("apple" in readOnlyJuiceMenu.keys)
    println(10 in readOnlyJuiceMenu.values)
}
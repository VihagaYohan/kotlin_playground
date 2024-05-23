package higher_order_functions

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {
    // for-each
    cookies.forEach {
        println("Menu item ${it.name}")
    }

    // map -> creates a new map
    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }
    println("Full menu : ")
    fullMenu.forEach {
        println(it)
    }

    // filter -> creates a sub-set of a collection
    val softBakedMenu = cookies.filter {
        it.softBaked
    }
    println("Soft cookies")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }

    // sortBy
    val alphabeticalMenu = cookies.sortedBy {
        it.name
    }
    println("Alphabetical menu")
    alphabeticalMenu.forEach {
        println(it.name)
    }
}
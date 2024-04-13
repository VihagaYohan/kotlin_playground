package collections

fun main() {
    // read-only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    // mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

    // prevent unwanted modifications, assign mutable list to a list
    val shapesLocked: List<String> = shapes
    println(shapesLocked)

    // list index
    println("first item in list ${readOnlyShapes[0]}")

    // first or last item in list
    println("first item in list ${readOnlyShapes.first()}")
    println("last item in list ${readOnlyShapes.last()}")

    // count
    println("list count ${readOnlyShapes.count()}")

    // use "in" operator to check item in the list
    println("circle" in readOnlyShapes)

    // to "add" or "remove" item from list
    shapes.add("pentagon") // add item
    shapes.remove("circle"); // remove item
    println(shapes)
}
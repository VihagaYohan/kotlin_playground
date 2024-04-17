package kotlin_null_safety

fun main() {
    var neverNull: String = "This's can't be null"

    var nullable: String? = "You can keep a null type"
    nullable = null

    // by default null values aren't accepted
    var inferredNonNull = "The compiler assumes non-nullable"

    // throws a compiler error
    // inferredNonNull = null

    var nullString: String? = null
    println(lengthString(nullString))

    // elvis operator
    println(nullString?.length ?: 0)
}
// check for null
fun describeString(maybeString: String?): String {
    if(maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Error or null string"
    }
}

// use safe calls
fun lengthString(maybeString: String?): Int? = maybeString?.length;

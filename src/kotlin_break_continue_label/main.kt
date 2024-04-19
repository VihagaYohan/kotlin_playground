package kotlin_break_continue_label

fun main() {
    // break and loop
    loop@ for(i in 1..10) {
        for (j in 1..100) {
            if(j == 90) break@loop
        }
    }

    foo()
    val result = foo1()
    println(result.toString())
}

fun foo() {
    listOf(1,2,3,4,5).forEach {
        if(it == 3) return // non-local return directly to the caller of foo()
        print(it)
    }
    println("this point is unreachable")
}

fun foo1() {
    listOf(1,2,3,4,5).forEach lit@ {
        if(it == 3) return@lit
        print(it)
    }
    print("done with explicit label")
}
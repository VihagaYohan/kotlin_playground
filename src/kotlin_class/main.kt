package kotlin_class

fun main() {
    val contact = Contact(1,"may@gmail.com")
    println(contact.email)
    // update property
    contact.email = "jane@gmail.com"

    println(contact.email)

    contact.printId()
    println(contact.category)

    val user = User("Alex",1)
    val secondUser = User("Alex",1)
    val thirdUser = User("Max",2)
    println(user)

    // compare instance
    println("user == secondUser : ${user == secondUser}" )
    println("user == thirdUser : ${user == thirdUser}")

    // copy instance
    println(user.copy())

    println(user.copy("Max"))

    println(user.copy(id=3))
}

class Contact(val id: Int, var email: String = "example@gmail.com") {
    val category: String = "work"

    fun printId() {
        println(id)
    }
}

// data classes
/*
* data class useful for storing data, data classes have the same functionality as classes
* automatically with additjonal memeber functions. eg: convert to readable output, compare instance of a classes, copy instance
* */
data class User(val name: String, val id: Int)

data class Employee(val name: String, var salary: Int)
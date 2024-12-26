package com.example.myapp

fun main() {
//Apply scope function
    var person = Person().apply {
        name = "Hanzala"
        age = 25
        city = "Rawalpindi"
        println("$name,$age")
    }
    println(person)

//with scope function
    val personValue: String = with(person) {
        "I am hanzala Arif"
    }
    println(personValue)

    //Let Scope Function
    val person3 = Person().let {
        it.name = "Hassan"
        it.age = 26
        it.city = "Rawalpindi"
        it.age
    }
    person3?.let {
        println(it)
    }
    //run Scope Function
    val person4 = person?.run {
        name = "Hussain"
        age = 15
        city = "Rawalpindi"
       listOf(
           name,age,city
       )
    }
    println("Run scope function answer")
    println(person4)
    println(person4?.size)

    //Also Scope Function
 val list:MutableList<Int> = mutableListOf(1,2,3)
    list.also {
        println("List")
        println(it.toString())
        println("Add one numer")
        it.add(4)
        println(it.toString())
        println("Remove one numer")
        it.remove(2)
        println(it.toString())
    }

}


class Person {
    var name: String? = null
    var age: Int? = null
    var city: String? = null
}

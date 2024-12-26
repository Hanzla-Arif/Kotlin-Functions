package com.example.myapp

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    list.forEach {
        println(it.toString())
    }
    println(name("Haznala", "Arif"))

    val persondata: (String, Int) -> Pair<String, Int> = { name, age ->
        Pair(name.uppercase(), age + 1)
    }

    val result = person("Hanzala", 24, persondata)
    println(result)
}

//Explicit anonymous function
val name = fun(firstName: String, lastName: String): List<String> {
    return listOf(firstName, lastName)
}

//Higher Order Function
private fun person(
    name: String,
    age: Int,
    Person: (String, Int) -> Pair<String, Int>
): Pair<String, Int> {
    return Person(name, age)
}
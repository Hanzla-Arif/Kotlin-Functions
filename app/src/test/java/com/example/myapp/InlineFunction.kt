package com.example.myapp

fun main() {
    greet("Hanzala")
    val result=operation(5,6){a,b->a+b}
    println(result.toString())
}

inline fun greet(name: String) {
    println("Happy Quaid-E-Azam Day $name")
}
inline fun operation(a:Int,b:Int,sum:(Int,Int)->Int):Int{
    return sum(a,b)
}
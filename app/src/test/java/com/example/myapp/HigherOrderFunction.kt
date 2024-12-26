package com.example.myapp

fun main() {
    println("Enter operation type (add, Subtract, Multiply, Divide):")
    val type= readLine()?.trim()
    println("Enter first number:")
    val num1= readLine()?.toIntOrNull()?:0
    println("Enter second number:")
    val num2= readLine()?.toIntOrNull()?:0
    println("Result")
    val operation= calculateValue(type.toString())
    val result=operation(num1,num2)
    println(result.toString())
}
fun calculateValue(type: String): (Int, Int) -> Int {
    return when (type) {
        "add" -> { a, b -> a + b }
        "Subtract" -> { a, b -> a - b }
        "Multiply" -> { a, b -> a * b }
        "Divide" -> { a, b ->
            if (b != 0) a / b else {
                println("Cannot divide by zero!")
                0
            }
        }
        else -> { _, _ ->
            println("Invalid operation type!")
            0
        }
    }
}
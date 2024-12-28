package com.example.myapp

import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
//USed run blocking to maintain Coroutine
fun main()= runBlocking {
    println("Enter your id")
    val id = readLine()?.trim()?.toIntOrNull() ?: 0

    val receive: Flow<Pair<Int, String>> = userData(id)

    receive.collect {
        println("Data: ${it.first} -> ${it.second}")
    }
}
//Using flows through which emit and collect the data
private fun userData(id:Int): Flow<Pair<Int, String>> = flow{
    val list = listOf(
        1 to "Hanzala",
        2 to "Honey",
        3 to "Hussain",
        4 to "Abuzar",
        5 to "Azan",
        6 to "Shahid",
        7 to "Sajid",
        8 to "Ali",
        9 to "Ismail",
        10 to "Hannan"
    )
    list.filter { it.first == id }.forEach { emit(it) }

    // Optionally, emit a default value if no match is found
    if (list.none { it.first == id }) {
        emit(id to "No match found")
    }
}
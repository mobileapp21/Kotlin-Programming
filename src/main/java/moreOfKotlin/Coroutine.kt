package moreOfKotlin

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    println("Before coroutine call")
    runCoroutine()
    println("After coroutine call")
}

fun runCoroutine() = runBlocking {
    launch {
        println("Hello")
        delay(1000L)
        println("World!")
    }
}
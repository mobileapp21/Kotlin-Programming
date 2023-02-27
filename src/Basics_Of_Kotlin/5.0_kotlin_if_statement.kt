package Basics_Of_Kotlin

fun main(){
    val time = 20
    if (time < 18) {
        println("Good day.")
    } else {
        println("Good evening.")
    }

    //Kotlin else if
    val time1 = 22
    if (time1 > 10) {
        println("Good morning.")
    } else if (time1 < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }
        //Kotlin If..Else Expressions

    val time2 = 20
    val greeting = if (time2 < 18) {
        "Good day."
    } else {
        "Good night."
    }
    println(greeting)
}
package Basics_Of_Kotlin

import java.util.*

fun main(){
    var txt = "Hello World"
    println(txt[0]) // first element (H)
    println(txt[2]) // third element (l)
    var txt2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("The length of the txt string is: " + txt2.length)

    var txt3 = "Hello World"
    println(txt3.uppercase(Locale.getDefault()))   // Outputs "HELLO WORLD"
    println(txt3.lowercase(Locale.getDefault()))


    //String Comparison
    var txt4 = "Hello World"
    var txt5 = "Hello World c"
    println(txt4.compareTo(txt5))


    //Finding a String in a String

    var myTxt= "Please locate where 'locate' occurs!"
    println(myTxt.indexOf("locate"))  // Outputs 7

    // Quotes Inside a String
    var muTxtQ = "It's alright"
    var muTxtQ1 = "That's great"

    var firstName = "John"
    var lastName = "Doe"
    println(firstName + lastName)
    println("My name is $firstName $lastName")

    var firstName1 = "Roman "
    var lastName2 = "Coder"
    println(firstName1.plus(lastName2))


}
package kotlinPrograms

import java.util.*


fun main(){

        //Input Stream
        val scanner = Scanner(System.`in`)

        //Input Char Array Size
        print("Enter Char Array size: ")
        val size = scanner.nextInt()

        //Create Character array of Given size
        val charArray = CharArray(size)

        //Input array elements
        println("Enter Char Arrays Elements:")
        for (i in charArray.indices) {
            print("charArray[$i] : ")
            charArray[i] = scanner.next()[0]
        }

        //Print All Array Elements
        println("Array : ${charArray.contentToString()} ")

        //Get String from Cahr Array
        var strFromArray = String(charArray)

        //print String from Array
        println("String Converted from Array  : $strFromArray")


}
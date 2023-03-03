package kotlinPrograms
import java.util.Scanner

fun main(){
val scanner =Scanner(System.`in`)
    print("Enter Char Array size: ")
    val arraySize=scanner.nextInt()
    //  print(arraySize)
    val charArray=CharArray(arraySize)
    println("Enter Char Arrays Elements:")
    for (i in charArray.indices){
        print("charArray:[$i]")
        charArray[i]=scanner.next()[0]
    }
    println("Array:${charArray.concatToString()}")
    //Get String from Cahr Array
    val string=String(charArray)
    print(string)
}
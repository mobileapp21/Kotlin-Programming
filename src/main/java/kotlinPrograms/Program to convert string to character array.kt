package kotlinPrograms
import  java.util.*
fun main(){

        // InputStream to get Input
        val scanner = Scanner(System.`in`)

        //Input String
        print("Enter String : ")
        var str = scanner.nextLine()

        //convert String to Character Array
        val charArray = str.toCharArray()

        //Print Character Array get from String
        println("Character Array Elements  : ${charArray.contentToString()} ")


}
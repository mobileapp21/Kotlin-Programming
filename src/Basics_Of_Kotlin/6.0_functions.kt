package Basics_Of_Kotlin

//simple function
fun myFun(){
    println("my first fun")
}

//Function Parameters

fun myFunWithPar (name:String){
    println("my name is: $name")
}

//Functions returns
fun myFunWithReturns(): String {
    val  myName: String="Saadi";
    return (myName);
}
fun main(){
myFun()
    myFunWithPar("Roman")
   
    print( myFunWithReturns())

}
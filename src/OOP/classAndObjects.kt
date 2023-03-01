package OOP

class Car {
   var model="";
   var price="";
}

fun main(){
    val ob=Car()
    ob.price = "12$"
    ob.model="2023"
    println(ob.price)
    print(ob.model)
}
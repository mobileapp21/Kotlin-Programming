package Basics_Of_Kotlin

fun main(){
//    var n = 0
//    while (j < 5) {
//        println(j);
//        n++
//    }



    var i = 0
    while (i < 10) {
        if (i == 4) {
            i++
            continue
        }
        println(i)
        i++
    }


    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")

    for (x in cars) {
        println(x)
    }
}
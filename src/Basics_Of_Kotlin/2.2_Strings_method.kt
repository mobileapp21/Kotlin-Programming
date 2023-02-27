package Basics_Of_Kotlin



fun main(){
    val nameSurname = "  Halil Ozel   "

    println(nameSurname) //   Halil Ozel

    // trim()  : This method deletes spaces.
    println(nameSurname.trim()) // Halil Ozel


    // String Value
    var tvSeries = "How I Met Your Mother"

    // split() : This method divides
    println(tvSeries.split(" ")) // [How, I, Met, Your, Mother]

}
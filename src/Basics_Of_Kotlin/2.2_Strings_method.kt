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
// When it finds the letter r, it divides it up.
    println(tvSeries.split("r")) // [How I Met You,  Mothe, ]

    // When it finds the letter o, it divides it up. New Array is ready
    var newSeries = tvSeries.split("o")

    println("newSeries : $newSeries") // newSeries : [H, w I Met Y, ur M, ther]

    println("newSeries Size : ${newSeries.size}") // newSeries Size : 4

    println("newSeries[2] = ${newSeries[2]}") // newSeries[2] = ur M
}
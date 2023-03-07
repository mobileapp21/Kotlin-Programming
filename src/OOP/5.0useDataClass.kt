package OOP
//
data class Question2<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)


fun main() {
    val question1 = Question2<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question2<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question2<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    println(question1.toString())
}
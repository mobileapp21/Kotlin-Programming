package OOP

enum class Difficulty {
    EASY, MEDIUM, HARD
}


class Question1<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)


val question1 = Question1<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
val question2 = Question1<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
val question3 = Question1<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
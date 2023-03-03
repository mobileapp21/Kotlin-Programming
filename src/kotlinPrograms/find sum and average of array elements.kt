package kotlinPrograms
import  java.util.*
fun main(){

        //Input Stream
        val s = Scanner(System.`in`)

        //Input Array Size
        print("Enter number of elements in the array: ")
        val size = s.nextInt()

        //Create Double array of Given size
        val doubleArray = DoubleArray(size)

        //Input array elements
        println("Enter Arrays Elements:")
        for (i in doubleArray.indices) {
            print("doubleArray[$i] : ")
            doubleArray[i] = s.nextDouble()
        }

        //declare variable for sum of elements
        var sum: Double=0.toDouble()

        for (i in doubleArray.indices) {
            //add array element in sum
            sum+=doubleArray[i]
        }

        //Avg of elements
        var avg=sum/doubleArray.size

        //Alternatively we can also use sum() and average() method of Arrays Class in
        //var sum = doubleArray.sum()
        //var avg = doubleArray.average()

        println("Array : ${doubleArray.contentToString()} ")
        println("Sum of Elements : $sum")
        println("Average of Elements : $avg")


}
package kotlinPrograms

class MyClass{
    var firstNum:  Int=0
    var secondNum: Int=1
    var res:  Int =0;
    fun Fibonacci(count: Int): String {
       if (count>0){
           res=firstNum+secondNum;
           println(res)
           firstNum=secondNum;
           secondNum=res
          Fibonacci(count-1)
       }
return "";
    }

}
fun main(){

    var obj=MyClass();
    println(obj.Fibonacci(10-2))

}



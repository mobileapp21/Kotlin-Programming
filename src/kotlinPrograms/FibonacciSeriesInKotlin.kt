package kotlinPrograms

fun main(){
    var firstNum:  Int=0
    var secondNum: Int=1
    var res:  Int ;
    var count =2;
    val i=2;
     while(count<10){
         res=firstNum+secondNum;
         println(res)
         firstNum=secondNum;
         secondNum=res;
       count++;
     }

}
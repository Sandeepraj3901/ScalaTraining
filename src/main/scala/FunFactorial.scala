object FunFactorial {

     def main(args:Array[String]) ={

         println(factorial(10))

     }

     def factorial (num:Int):Int ={
       var fact = 1
       for ( i <- 1 to num){
           fact *= i

       }
       fact
     }

}

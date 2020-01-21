object FunFibonacci {

    def main(args:Array[String]): Unit ={

       fibonacci(5)

    }

    def fibonacci(num:Int): Unit = {

         var a,b =0
         var f = 0
         for (n <- 0 to num ){

           if (n <= 1) {
             a = 1
             b = 1
             print(s"$a,")
           }
          else {

             f  = a + b
             a = b
             b = f
             print(s"$f,")
           }



         }

    }

}

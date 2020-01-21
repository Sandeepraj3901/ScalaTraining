object FunRecursive2 {

    def main(args:Array[String]): Unit = {
      for ( i <- 0 to 5)
      print(fib(i) + ",")

    }

    def fib(n:Int): Int ={

      if (n <= 1) {
        return 1
      } else
        fib(n-1) + fib(n-2)
    }

}

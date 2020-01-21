object FunRecursive1 {

  def main(args:Array[String]): Unit ={

       println(factorial(100000000))
  }

  def factorial(num:Int):Int ={

     if (num <= 1) return 1
     else
       num * factorial(num - 1)

  }

}

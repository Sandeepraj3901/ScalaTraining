object FunWithNamedArg {

  def main(args:Array[String]): Unit ={

    printMe(c="Raj",a=10,b=20)
    printMe(20,30,"Raj")
  }

  def printMe(a:Int,b:Int,c:String): Unit ={

      println(s"a:$a")
      println(s"b:$b")
      println(s"c:$c")
  }

}

object FunDefaultParm {

    def main(args:Array[String]): Unit ={

        printMe(20,30)
        printMe(b=70)
        printMe(60)
        printMe()
    }

     def printMe(a:Int = 5,b:Int = 10): Unit ={

        println(s"a=$a")
        println(s"b=$b")

     }

}

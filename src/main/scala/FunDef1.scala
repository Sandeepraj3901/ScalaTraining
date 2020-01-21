object FunDef1 {

    def main(args:Array[String]): Unit = {

        addition(10,20)
        println(addition(30,40))
        greet()
        val flag = validation(10)
        println(flag)
    }

    def addition(a:Int,b:Int) ={
       val sum:Int = a + b
       println(s"sum:$sum")

    }

    def greet(): Unit ={
       println("Hello!")

    }

    def validation(a:Int):Boolean = {

       if (a > 100) {
         return true
       }
       else {
         return false
       }


    }

}

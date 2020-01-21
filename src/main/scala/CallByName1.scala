object CallByName1 {

   def main(args:Array[String])={


        addition(initialize())


   }

   def initialize():Int = {
     val a = 10
     println("Inside initialization")
     a
    }

    def addition(f: => Int): Unit ={
      println("Inside addition")
      println(f)

    }

}






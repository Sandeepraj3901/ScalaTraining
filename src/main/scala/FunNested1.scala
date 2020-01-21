object FunNested1 {

    def main(args:Array[String])={

       val res = outerfun("Raj","Y")

        println(res)
    }

   def outerfun (lname:String,fname:String): String ={
       println("Inside outer function")

       def innerfun(a:String,b:String): String ={

         println("Inside Inner function")

         a + " " + b

       }

     val result = innerfun(lname,fname)
     result


   }

}

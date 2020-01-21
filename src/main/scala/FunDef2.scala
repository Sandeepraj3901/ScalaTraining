object FunDef2 {

   def main(args:Array[String]): Unit ={

     val res = multiply(10,10,10)
     println(s"res:$res")
     multiplyPrint(10,10,10)

     println(concat("Raj","Y"))

   }

   def multiply(a:Int,b:Int,c:Int):Int={
     a * b * c
   }

   def multiplyPrint(a:Int,b:Int,c:Int)={

       println("Result:" + (a * b * c))


   }

    def concat (fname: String, lname:String) ={

       val result = fname + " " + lname
       result
    }

}

object FunPartApplied1 {

     def main(args:Array[String]): Unit ={

      val res = partApplied(10,_:String )
       res("Raj")  //partially applied function
       res("Bharat")

     }

     def partApplied(a:Int,b:String): Unit ={

         println(s"a:$a, b:$b")
     }

}

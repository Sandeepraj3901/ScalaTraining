object FunPartialApplied1 {

     def main(args:Array[String]) ={

         val partialAdd = add(10,_:Int)

         println(partialAdd(20))
       println(partialAdd(30))
       println(partialAdd(40))
       println(partialAdd(50))



     }

     def add(a:Int,b:Int) ={

         a + b
     }

}

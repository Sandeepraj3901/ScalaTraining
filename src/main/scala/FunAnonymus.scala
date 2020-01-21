object FunAnonymus {

     def main(args:Array[String]) ={

        val add = (a:Int,b:Int) => a + b
        val greet = () => println("Hello")

         println(add(10,20))
         greet()
     }

}

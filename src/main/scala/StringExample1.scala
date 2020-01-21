object StringExample1 {

    def main(arg:Array[String]) ={

         var str ="  Hello World     "

         println("Length:" + str.length())
         println(str.indexOf('o'))

         var str1 = "Hello|world|Hello|Raj"

         println(str.substring(3))
         println(str.substring(2,7))
         println(str.trim())

         var result:Array[String] = str1.split('|')

          for( i <- 0 until result.length){

               println(result(i))

          }
      for( word <-  result){

        println(word)

      }




    }

}

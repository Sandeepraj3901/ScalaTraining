object ForLoops {

     def main(args:Array[String]): Unit ={

           // For Loop with Range
           println("This is Range For Loop")
           for (x <- 1 to 10){

               println(x)
           }

          // for Loop with Until
          println("This is Until for Loop")
          for (y <- 1 until 10 ){

               println(y)
          }

          //For loop with multiple Ranges
           println("For loop with multiple Ranges")
           for (i <- 1 to 3 ; j <- 10 to 12 ; k <- 17  to 19){

               println()
               println(s"i=$i,j=$j,k=$k")
           }

         println("For loop with Inner loops")
           for (i <- 1 to 3) {
               for (j <- 10 to 12){
                  for (k <- 17 to 19) {
                    println()
                    println(s"i=$i,j=$j,k=$k")
                  }
               }
           }
     }
}

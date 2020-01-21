object ForLoop2 {

     def main(args:Array[String]): Unit ={

       //for loop with Guarding

           for (x <- 1 to 50 if (x % 2 != 0); if (x % 3 == 0);if(x % 5 == 0)) {

                println(x)
           }
       // For loop for Collections --for each type syntax
          val list = List(1,3,5,7,9,10,20)
          for ( e <- list if e % 5 == 0){
             println(e)
          }

       println("LAst for loop")
          for (x <- List(10,20,30,40)){


              println(x)
          }

     }

}

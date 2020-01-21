object ForLoop3 {

    def main(args:Array[String])={

      val result = for { i <- 1 to 1000
                              if i % 3 == 0 && i % 25 ==0
                 } yield (i)

           println(result)
           for ( r <- result ) {

              println(r)

            }

         }




}

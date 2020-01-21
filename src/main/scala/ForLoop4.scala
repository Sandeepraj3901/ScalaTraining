object ForLoop4 {


      import scala.util.control.Breaks

      def main(args:Array[String]):Unit = {

           val outloop = new Breaks()
           val inloop  = new Breaks()

        outloop.breakable {
          for (x <- 1 to 10) {

            inloop.breakable {
              for (y <- 1 to 10) {

                if (y == 5) {
                   println(s"y=$y")
                   inloop.break
                }
              }
            }
            if (x == 3) {
                println(s"y=$x")
                outloop.break
            }
          }
        }
      }


}

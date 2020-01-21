import scala.util.control.Breaks

object LoopControls {

    def main(args:Array[String]) = {
      val loop = new Breaks()
      var x = 1

      loop.breakable {
        while (x < 100) {

           println(s"x=$x")
          if (x == 10) {
            println("X reached break point")
            loop.break()
          }
          x += 1

        }

      }
    }
}

object PatternMatching2 {

      def main(args:Array[String]): Unit ={

        val stuff = "red"

        val mystuff = stuff match {

          case "blue" => println("Blue");1
          case "red"  => println("Red");2
          case "green" => println("Green");3
          case _ => println(stuff);0
        }

         println(mystuff)

      }



}

object PatternMatching10 {

    def main(args:Array[String]): Unit ={

        println(matchTest("two"))
        println(matchTest("test"))
        println(matchTest(1))
        println(matchTest(5.0))
      }
      def matchTest(x: Any): Any = x match {
        case 1 => "one"
        case "two" => 2
        case y:Int => "scala.Int"
        case _ => "many"
      }


}

object ScalaPatternMatch extends App{

  val x:Any = 2
  val result = x match {

    case "two" => "I have a match"
    case 2  => "Two"
    case _ => "No Match"


  }

  println(result)

}

object PatternMatching7 {
  def main(args:Array[String]) ={


   // back quotes to be used when variable to be used as stable variable
    def patternEquals(i: Int, j: Int) = j match {
      case `i` ⇒ true
      case _ ⇒ false
    }

     println(patternEquals(3,4))
    println(patternEquals(4,5))
    println(patternEquals(9,9))

  }



}

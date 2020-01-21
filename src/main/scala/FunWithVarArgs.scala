object FunWithVarArgs {

  def main(args:Array[String]): Unit ={
     printMe("Raj","Sekhar","Reddy")
  }

  def printMe(names:String*): Unit ={
    var i = 0
    for (name <- names) {

      println("name value at ["+ i + "] = " + name )
      i += 1
    }
  }

}

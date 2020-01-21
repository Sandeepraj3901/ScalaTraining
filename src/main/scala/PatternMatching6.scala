object PatternMatching6 {

  def main(args:Array[String]): Unit ={

    println(matchExpr(("porridge","papa")))
    println(matchExpr(("chair","Raj")))
    println(matchExpr("sofa","Raj"))

  }

  // Pattern matching can substitute for parts of expression
  def matchExpr (expr: Any)= expr match {
    case ("porridge", bear) => bear + " said someone's is eating my porridge "
    case ("chair",bear) => bear + " said someone's sitting on my chair"
    case ("bed",bear) => bear + " said someone's is sleeping on my bed"
    case _ => "What?"
  }
}

object PatternMatching4 {

    def main(args:Array[String])={

         println(matchExpr(("porridge","baby")))
      println(matchExpr(("Rice","Raj")))

    }

    def matchExpr(expr:Any) = expr match {

      case ("porridge","papa") => "papa eating porridge"
      case ("porridge","mama") => "mama eating porridge"
      case ("porridge","baby") => "baby eating porridge"
      case _ =>  "what?"

    }

}

object PatternMatching5 {

    def main(args:Array[String])={

      println(matchExpr(("porridge","Ranga")))
      println(matchExpr(("bed","baby")))

    }

    def matchExpr(expr:Any) = expr match {
      case ("porridge",_) => "eating"
      case ("chair","mama") => "sitting"
        case("bed","baby") => "sleeping"
      case _ => "what?"

    }

}

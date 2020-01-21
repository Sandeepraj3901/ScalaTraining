object PatternMatching1  {

     def main(args:Array[String]) ={

       var numdesc = MatchNumber(1)
       println(numdesc)

       numdesc = MatchNumber(5)
       println(numdesc)
     }

     def MatchNumber( x: Int) = x match {

       case 1 => "One"
       case 2 => "two"
       case 3 => "three"
       case _ => "others"
     }
}

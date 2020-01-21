object VarDeclaration {



     def main(args: Array[String])={

           val a = 40
           val b = 30
           val c = 40

           if ((a  > b) && (a > c) ) println(s"$a is larger")
           else if ((b > a) && (b > c )) println(s"$b is larger")
           else println(s"$c is larger")


           val result = a * b + b/c +(a+b+c) - a + (b+c)

           println("Result "+ result)

           if ( a > b) {
              if ( a > c) {
                  println( s"$a is Larger")
              }else if (a == c){
                 println(s"both a= $a and c=$c are equal and they are Large")
              } else println(s"$c is Larger")

           } else if (b > c) {
               println(s"$b is Larger")
               if( b == c ) {
                  println(s"both b=$b and c=$c are same and they are Large")
               }else println(s"$c is larger")

           }else println(s"$c is Larger")





       }








}

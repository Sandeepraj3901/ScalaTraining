object ScalaSets extends App {

      val ss1:Set[Int] = Set(1,2,2,3,1,3,2,1,5,6)
      val ss2 = Set()

       val ss3 = Set(16,17,12,11,1,5)

      println(ss1)

       for ( x <- ss1){
         println(x)
       }

      val ss4 = ss1 ++ ss3

      println(ss4)


      val ss5 = ss1.++(ss3)
     println(ss5)

     println("Max  of Set:"+ ss5.max)

     println(ss1.&(ss3))
     println(ss1.intersect(ss3))
}

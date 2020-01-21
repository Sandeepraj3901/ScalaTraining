object PatternMatchin3 {

     def main(args:Array[String]) ={

       val stuff ="green"

         val mystuff = stuff match {

           case "red" => (0,0.1f,200)
           case "blue" => (1.0,0,260)
           case _ => (10,"Raj",100)
         }
       println(mystuff._1,mystuff._2,mystuff._3)
     }



}

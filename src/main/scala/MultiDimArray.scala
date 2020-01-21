import Array._
object MultiDimArray {

      def main(args:Array[String]) ={

          var ma = ofDim[Int](3,3)

           for (i <- 0 to 2;j <- 0 to 2){

                ma(i)(j) = i+j
           }

           for (i <- 0 to 2; j <- 0 to 2){

               println (ma(i)(j))
           }
      }
}

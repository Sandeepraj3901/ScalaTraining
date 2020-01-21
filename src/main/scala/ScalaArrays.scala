object ScalaArrays extends App {

    val A:Array[Int] = new Array[Int](3)

    val B:Array[Int] = Array(60,30,80)

     A(0) = 10
     A(1) = 20
     A(2) = 30

     A(0) = 40
     A(2) = 60

     println(A(2))

  val C = A.clone()
  println(C(2))

  for (i <- 0 until A.length){
    println(A(i))
  }

  for(i <- A){

    println(i)

  }

}

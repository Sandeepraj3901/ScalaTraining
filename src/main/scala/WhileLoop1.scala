object WhileLoop1 {

  def main(args: Array[String]): Unit = {

      val repeat = 10
      var count = 1
      while(count <= repeat){

          println("Hello")
          count += 1

      }

      do {
        println("I am greeting again, Hello")
      }while (count <= repeat)

  }

}

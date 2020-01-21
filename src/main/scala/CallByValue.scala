object CallByValue {

    def main(args:Array[String]): Unit ={

       delayed(time())


    }

  def time(): Long = {
      println("Inside Time Method")
      System.nanoTime
  }

  def delayed(t:Long):Unit ={
      println("Inside Delayed method")
      println("Param: " + t)
  }

}

object CallByName {

  def main(args:Array[String]): Unit ={

    delayed(time1())

  }

  def time(): Long = {
    println("Inside Time Method")
    System.nanoTime
  }
  def time1(): Long = {
    println("Inside Time Method1")
    System.nanoTime
  }
  def delayed(t: => Long):Unit ={
    println("Inside Delayed method")
    println("Param: " + time1())
  }

}

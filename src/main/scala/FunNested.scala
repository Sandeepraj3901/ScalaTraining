object FunNested {

  def main(args: Array[String]) {
    println( factorial(0) )
    println( factorial(1) )
    println( factorial(2) )
    println( factorial(3) )

    println(factorial(35))
  }
  def factorial(i: Int): BigInt = {
    def fact(i: Int, accumulator: BigInt): BigInt = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }
    fact(i, 1)
  }


}

object PatternMatching8 {

  def main(args:Array[String]): Unit ={

    // Pattern match on list if more than one element in the list
    val secondElement = List(1,2,3) match {
      case x :: xs ⇒ xs.head
      case _ ⇒ 0
    }
    println(secondElement)

    val secElement = List(1, 2, 3) match {
      case x :: y :: xs ⇒ y
      case _ ⇒ 0
    }
    println(secElement)

    val sElement = List(1) match {
      case x :: y :: xs ⇒ y // only matches a list with two or more items
      case _ ⇒ 0
    }

      println(sElement)

    val r = List(1, 2, 3) match {
      case x :: y :: Nil ⇒ y // only matches a list with exactly two items
      case _ ⇒ 0
    }
    println(r)

    //If a pattern is exactly one element longer than a List, it extracts the final Nil
    val r1 = List(1, 2, 3) match {
      case x :: y :: z :: tail ⇒ tail
      case _ ⇒ 0
    }

    println(r1)

  }

}

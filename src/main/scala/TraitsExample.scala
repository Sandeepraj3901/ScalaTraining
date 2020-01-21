class GreetPeople extends TraitsGreeting {

     def greet(): Unit ={
       println("Hello")
     }
}
object TraitsExample {

  def main(args:Array[String]): Unit ={

      val r = new GreetPeople()
      r.greet()
  }

}

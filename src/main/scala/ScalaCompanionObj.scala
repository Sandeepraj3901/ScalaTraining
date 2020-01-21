object ScalaCompanionObj extends App {

  A.greetme()

  val obj: A = new A()

  obj.greetothers()

  object A {

    def greetme(): Unit = {
      println("Hello I am from Object A")
    }
  }

  class A {

    def greetothers() = {

      println("Hello I am from class A")
    }
  }

}
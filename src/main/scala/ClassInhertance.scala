object ClassInhertance {
    def main(args:Array[String]): Unit ={

        val obj = new C()
        obj.printA()
        obj.printB()
        obj.printC()
    }
}


class A {

     def printA(): Unit ={
        println("I belong to Class A")
     }
}

class B extends A {

    def printB()={

      println("I belong to Class B")
    }
}

class C extends B {

  def printC(): Unit = {
    println("I belong to Class C")
  }
  override def printA(): Unit ={
    println("I belong to Class C")
  }

}

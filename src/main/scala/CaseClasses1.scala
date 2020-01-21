object CaseClasses1 {

      def main(args:Array[String]): Unit ={



        val p1 = Person("John",30,"M")
        val p2 = Person("Lisa",25,"F")

        println(p1.name)
        val p3 = p1.copy()
        val p4 = p2.copy(name="Allen")
        println(p4)

      }

}

case class Person(name:String,age:Int,gender:String)

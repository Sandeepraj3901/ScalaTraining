import com.training.TestObject
object MainObject {

    def main(args:Array[String]) ={

        println("a:"+ TestObject.a)
        println("b:" + TestObject.b)
        TestObject.add()

        val obj = new TestClass()
        val obj1 = new TestClass()
        println("obj.a:"+ obj.a)
        println("obj.b:" + obj.b)
        obj.add()
        obj1.a = 100
        obj1.b = 200
        obj1.add()
    }

}

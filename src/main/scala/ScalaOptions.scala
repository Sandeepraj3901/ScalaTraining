object ScalaOptions extends App{

     val a:Option[Int] = Some(20)
     val b:Option[String] = None

     println(a)
     println(a.get)
     println(a.getOrElse(0))
     println(b)
     println(b.getOrElse(""))

     println(a.isEmpty)
     println(b.isEmpty)

}

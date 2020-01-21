object ScalaMaps extends  App{

     val m:Map[String,Int] = Map("Raj" -> 25,"Abhi" -> 20)

     var n:Map[String,Int] = Map()

     n += ("Girish" -> 21)

      println(m)
      println(n)

    println(m.keys)
    println(m.values)

    for (key <- m.keys) {

        println(m(key))
    }


}

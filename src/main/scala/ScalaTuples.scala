object ScalaTuples extends App {

    val t = (5,"Raj")
    val t1 = new Tuple2("Sekahr",33)

    val t2 = (5,25.5,"Y",'c')

    println("First element:"+ t2._1)

  println("2nd element:"+ t2._2)

  println("4th element:"+ t2._4)

    val t3 = (35,(40,50))

  // Access tuple inside the tuple
    println(t3._2._1)

    t2.productIterator.foreach(x => println(x))

    println(t2.toString())







}

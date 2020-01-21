object ScalaLists extends App {

     val names1:List[String] = List("Raj","Girsh","Satheesh")
     val names2 = "Shyam" :: ("Abhinay" :: ("Tejasree"::Nil))

     println(names1)
    println(names2)

    val names = names1 ::: names2
    println(names)

    val namesx = names1.:::(names2)
    println(namesx.reverse)

     val fruit = List.fill(4)("Apple")

    println(fruit)



    val namesy = List.concat(names1,names2)

    println(namesy)

    for(x <- names)
        {

            println(x)
        }

     val squares = List.tabulate(6)( n => n * n)

      println(squares)



}

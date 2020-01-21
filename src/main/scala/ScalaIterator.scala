object ScalaIterator extends App {

    val it = Iterator("Raj",35,"Y",45,5,6,true)

    while (it.hasNext){

        println(it.next())
    }

    for( i <- it) {

       println(i)
    }

    val it1 = Iterator(10,30,1,25,100,10000,45)


}

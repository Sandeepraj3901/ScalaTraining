object FunCurry {

    def main(args:Array[String]) ={

       println( add(10)(10))


    }

    def add(a:Int)(b:Int): Int = {
       a + b
    }


}

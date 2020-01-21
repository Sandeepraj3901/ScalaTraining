object FunHighOrder1 {

    def main(args:Array[String])={

      printMe(concat("Raj","Y"))


    }

    def concat(lname:String,fname:String)={
         println("inside concat")
         fname + " " + lname
    }

    def printMe(f: => String): Unit = {
         println("inside printMe")

        println(f)
    }
}

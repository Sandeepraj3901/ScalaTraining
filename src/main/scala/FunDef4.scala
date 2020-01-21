object FunDef4 {

    def main(args:Array[String]): Unit ={

      val result = add(10,20,30,40,60,70,80)
      println("Result:"+ result)

    }

    def add(nums:Int*):Int ={
       var sum = 0
       for (num <- nums ){

           sum += num
       }
        sum

    }





}

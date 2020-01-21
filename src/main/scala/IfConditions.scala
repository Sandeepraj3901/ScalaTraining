object IfConditions {

  def main(args: Array[String]): Unit = {


    val x = 55
    val y = 45
    val z = 35

    if ((x > y) && (x > z)){
       println("Largest number is " + x)
    }else if(y > z)  {
       println("Largest Number is " + y)
    }else{

      println("Largest Number is " + z)
    }


  }

}

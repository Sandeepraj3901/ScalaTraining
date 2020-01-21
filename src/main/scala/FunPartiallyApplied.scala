import java.util.Date
//Partially applied function

object FunPartiallyApplied {

  def main(args: Array[String]) {
    val logWithDateBound = log(new Date, _ : String)
    logWithDateBound("message1" )
    logWithDateBound("message2" )
    logWithDateBound("message3" )
  }
  def log(date: Date, message: String) = {
    println(date + "----" + message)
  }


}

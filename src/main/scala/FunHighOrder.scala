object FunHighOrder {
    def main(args:Array[String]): Unit ={

         println(apply(layout,10))
    }

  def apply(f:Any => String,v:Int): String ={
    f(v)
  }

  def layout(x:Any):String ={
    "[" + x.toString() +"]"
  }
}

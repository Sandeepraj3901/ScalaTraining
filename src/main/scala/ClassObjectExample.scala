class Point(i: Int, j: Int) {

  var x: Int = i

  var y: Int = j

  def move(xd: Int, yd: Int) {

    x = x + xd

    y = y + yd

    println ("Point in x location is: " + x);

    println ("Point in y location is : " + y);

  }

}

object ClassObjectExample {

    def main(args:Array[String]): Unit ={

      val pt1 = new Point(10, 0)
      pt1.move(10,20)
    }

}

object ConcatString {

    def main(args:Array[String])={

         val filter_input="UNMAPPED,International"
         val filter_array=filter_input.split(",").map(x => s"'$x'")
         var filter_string =""
      println(filter_array)
         for (str <- filter_array) {
             println("inside for")

             if (!filter_string.isEmpty()) {
               println("inside IF")
               filter_string += ","
             }
             println(str)
             filter_string += str

         }
         println(filter_string)

    }
}

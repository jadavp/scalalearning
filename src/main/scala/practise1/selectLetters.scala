package practise1

object selectLetters extends App {

  def selectLetters(str1: String, str2: String):String = {
    val len = Math.min(str1.length,str2.length).toInt
    val str1_index = for(i <- 0 to len-1 if(str2.charAt(i).isUpper)) yield str1.charAt(i)
    val str2_index = for(i <- 0 to len-1 if(str1.charAt(i).isUpper)) yield str2.charAt(i)
    str1_index.mkString + str2_index.mkString
  }

  assert(selectLetters("EVERYTHING", "SomeThings").equals("EYSomeThings"))

}

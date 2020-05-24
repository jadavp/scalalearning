import scala.collection.mutable

object convertToRoman extends App {
  val lookup = mutable.HashMap(1 ->"I",4 -> "IV", 5 -> "V" , 9 -> "IX" , 10 -> "X", 40 -> "XL", 50 -> "L", 90 -> "XC",100 -> "C", 400 -> "CD", 500 -> "D",900 -> "CM",1000 -> "M")
  val value = lookup.keySet
  def convertToRoman(deci: Int):String = {
    if(deci <= 0)
      ""
    else {
     val max_value  = for (va <- value if (va <= deci)) yield va
      if(max_value.max==1)
       lookup.apply(max_value.max)
      else
       (lookup.apply(max_value.max))*(deci/max_value.max) +convertToRoman(deci % max_value.max)}
  }
 println(convertToRoman(3999))
}

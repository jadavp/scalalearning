package practise1

object missingLetter extends App{


  val lat = Array("m", "o")

  def missingLetter(lat: Array[String]) = {

    for (i <- 0 to lat.length - 2 if !((lat(i).head + 1).toChar.toString.equals(lat(i + 1)))) yield (lat(i).head + 1).toChar.toString

  }
  assert(missingLetter(lat).mkString.equals("n"))
}

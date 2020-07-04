package practise1

object Solution {
  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val n = stdin.readLine.trim.toInt

    def factorial(n: Double): Double = {
      if (n == 1) 1
      else n * factorial(n - 1)
    }

    for (nItr <- 1 to n) {
      val x = stdin.readLine.trim.toDouble
      println(((for (i <- 1 to 9) yield Math.pow(x, i) / factorial(i)).sum) + 1)
    }
  }
}

object Solution12 {

  def main(args: Array[String]): Unit = {
    val readLine = scala.io.StdIn.readLine.trim.toString
    println(readLine.toCharArray.toList.foldLeft(List[Char]()) {
      case (acc, item) if acc.contains(item) => acc
      case (acc, item) => item :: acc
    }.reverse.mkString)
  }
}

/*object Solution13 {

  def main(args: Array[String]) {
    val under = "_"
    val one = "1"
     val iteration1 =  for (j <- 1 to 63 if j % 2 != 0) yield (under * ((63-j)/ 2)) + one * (j) + (under * ((63-j)/ 2))
    iteration1.foreach(println)
    for(j<- 16 to 32){
      for( i <- 1 to iteration1(j).length) yield{
        if(i <= )
      }
    }
    }
}*/


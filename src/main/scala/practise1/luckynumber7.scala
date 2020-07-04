package practise1

object luckynumber7 {

  val numberList = List(1,7,2,4,7)
  println(numberList.map(x => if(x==7) 14 else x).sum)
}

object CanYouBalance extends App{

  val list = List(1,5,3)

  def balanceList(list1:List[Int],list2:List[Int] = List()):Boolean ={
    list match {
      case xs::tail if tail.size <= 1 => false
      case xs::tail if list2.sum == list.sum => true
      case xs::tail => balanceList(tail,xs::list2)
      case _ => false
    }
  }

  println(balanceList(list))
}

object extra extends App{
  val n = 2
  val x = 0.0000
  def factorial(i:Double):Double ={
    if( i == 1) 1
    else i * factorial(i-1)
  }
  val stdin = scala.io.StdIn
  val line = stdin.readLine.trim.toString
   val cleanerlinee = line.toCharArray.foldLeft(List[Char]()) {
   case (acc, item) if acc.contains(item) => acc
   case (acc, item) => item::acc
 }
  println(cleanerlinee.reverse.mkString)
}

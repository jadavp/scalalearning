package practise1

object getHashTags extends App {

  def getHashTags(con: String):IndexedSeq[String] = {
   val arr =  con.split("\\W+").sortWith(_.length > _.length)
    val result =  arr.take(3).map((x:String) => "#"+x)
    result
  }

  println(getHashTags("How the Avocado Became the Fruit of the Global Trade"))

}

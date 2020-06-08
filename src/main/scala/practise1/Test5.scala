package practise1

object Test5 extends App{



  def makeRowsSeq(row:Integer)=
    for(col <- 1 to 10) yield {
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }
  def makeRow(row:Integer)= makeRowsSeq(row).mkString

  def tableseq =
    for (row <- 1 to 10) yield
      {
        makeRow(row)
      }

  println(tableseq.mkString("\n"))
}

package practise1

object Test6 extends App {

  def starprint(no: Integer) =
    for (i <- 1 to (2*no-1)) yield {
      val n =
        if (i <= no) i
        else 2*no - i
        val star = "* " * n
        val padding = " " * (no - n)
        padding + star
        }

  println(starprint(21).mkString("\n"))
}

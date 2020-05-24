object Test7 extends App{


  def fibo(no: Integer): Integer = {
    if(no == 1) 1
    else no + fibo(no-1)
  }

  def starprint(no: Integer) =
    for (i <- 1 to no) yield {
      val n = fibo(i)
      val star = "* " * n
      val padding = " " * (fibo(no) - n)
      padding + star
    }

  println(starprint(10).mkString("\n"))
}

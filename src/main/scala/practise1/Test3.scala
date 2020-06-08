package practise1

object Test3 extends App{


  def xPronounce(value:String) =
    {
      val regex = "x"
      val regex1 = " x "
      val regex2 = "\bx"
      value.replace(regex1," ecks ").replace(regex2,"z").replace(regex,"cks")
    }

  println(xPronounce("Inside the box was a xylophone"))
}

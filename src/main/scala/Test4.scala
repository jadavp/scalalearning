object Test4 extends App {

  val test = "shanti om"

  def serachfrom(i:Integer): Integer = {
    if(i >= test.length()) -1
    else if(test.charAt(i).equals('o')) i
    else serachfrom(i+1)
    }

  println(serachfrom(1))

}

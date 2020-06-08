package practise1

object abacabaPattern extends App {


  def abacabaPattern(number: Int): String = {
    if (number ==1)
      "A"
    else if(number ==2)
    "ABA"
    else
      abacabaPattern(number-1)+(64+number).toChar.toString+abacabaPattern(number-1)
  }

  assert(abacabaPattern(5).equals("ABACABADABACABAEABACABADABACABA"))
}

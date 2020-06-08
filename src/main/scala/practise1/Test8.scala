package practise1

object Test8 extends App{


  def primeNumber(number: Int) = {
    for (i <- 2 to number if(noOfDivisor(i).length <= 2)) yield{
      i
    }
  }

  def noOfDivisor(number: Int)= for (i <- 1 to number if (number%i == 0)) yield i
  println(primeNumber(30).length)
}

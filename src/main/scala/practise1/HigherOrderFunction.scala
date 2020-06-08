package practise1

object HigherOrderFunction extends App {

  def withformatter(input: String)( op:String => String)=
    {
      println(op(input))
    }

  withformatter("hello"){x:String => x.filter(_.equals('e'))}
  withformatter("hello"){x:String => x.filter(_.equals('h'))}
}

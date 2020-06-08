package practise1



class Base()
case class Test1(name: String,lName:String) extends Base
case class Testp(name: String) extends Base

object Test1 {

  def apply(name:String,lname:String): Test1 = {

    new Test1(name, lname)
  }

    def unapply(arg: Test1): Option[(String, String)] = {
     Some(arg.name,arg.lName)

    }


}

object Ptest extends App{

  val t = Test1("hello","Neha")
  val t1 = Testp("Jaiswal")
  def findvalue(t: Base):String = {
    t match{
      case Test1(name,lname) => name+lname
      case _ => "you are not right person"
    }
  }

  println(findvalue(t))
}


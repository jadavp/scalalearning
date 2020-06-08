package practise1

object Test2 extends App{


  def kixCode(data:String) = {

    val process= data.split(",")
    process(2).take(8).replace(" ","")+process(1).takeRight(5).replace("-","X").replace(" ","")
  }
  println(kixCode("Dijk, Antwoordnummer 80430, 2130 VA Hoofddorp"))
}

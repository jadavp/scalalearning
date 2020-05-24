object isbnvalidation extends App{


  def isbn13(value: String):String = {

    if(value.length == 13 && isbntotal13(value).sum%10 == 0)
      "Valid"
    else
      if(value.length == 10 && isbntotal10(value).sum%11 == 0)
        if (isbntotal13(convertiebn10toisbn13(value)).sum%10 == 0)
          convertiebn10toisbn13(value)
        else
          "Invalid"
      else
      "Invalid"
  }
  def isbntotal13(value:String) =for(i <-1 to 13) yield if (i%2==0) value.charAt(i-1).toInt * 3 else value.charAt(i-1).toInt *1
  def isbntotal10(value:String) = for(i <-0 to 9) yield value.charAt(i).toInt * (10-i)
  def convertiebn10toisbn13 (value:String) = "978"+value.substring(0,9)+(value.substring(9,10).toInt+1).toString

  assert(isbn13("0316066524").equals("9780316066525"))

}

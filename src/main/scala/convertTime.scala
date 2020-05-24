object convertTime extends App{


  def convertTime(time: String):String = {
    if(time.contains("m")) {
      time.split(" ")(1) match {
        case "am" => if (time.contains("12")) time.replace("12", "0") else time.substring(0, 5)
        case "pm" => if (time.contains("12")) time.substring(0, 5) else time.replace(time.substring(0, 2), (time.substring(0, 2).toInt - 12).toString)
      }
    }
    else
      { if(time.equals("12:00"))
          time + " am"
        else if(time.contains("12"))
         time + " pm"
        else if(time.substring(0,2).toInt <=12)
          time+" am"
        else
          time.substring(0,2).toInt-12+time.substring(2)+" pm"
      }
  }
  println(convertTime("22:00"))

}

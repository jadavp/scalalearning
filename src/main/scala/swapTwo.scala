object swapTwo extends App{


  def swapTwo(str: String) = {
    val substr = for(i <- 1 to str.length/2) yield str.substring((i-1)*2,2*i)
    val result = for(i<- 0 to substr.length-1) yield substr(i).reverse
    val leftoverstring = str.substring((str.length-str.length%4),str.length)
    result.mkString+leftoverstring
  }
  assert(swapTwo("munchkins").equals("ncmuinhks"))
}

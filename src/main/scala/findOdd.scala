object findOdd extends App {


  def findOdd(arr: Array[Int]) = {
    val t = arr.groupMapReduce(identity)(_ => 1)(_ + _).filter((x)=> x._2 % 2 != 0 )
    t.keys.last
  }


val input = Array(20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5)
assert(findOdd(input)== 5)

}

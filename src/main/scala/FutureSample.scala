import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object FutureSample extends App {


  val fut = Future { Thread.sleep(10000); 42 }
  println(fut)
  Thread.sleep(20000)
  println(fut)
}

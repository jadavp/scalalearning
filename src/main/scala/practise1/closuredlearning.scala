package practise1

object closuredlearning extends App {

  private def filesHere = List("ravi", "neha", "prkash", "pooja")

  private def filesMatching(matcher: String => Boolean) =
    for (file <- filesHere; if matcher(file))
      yield file

  def filesEnding(query: String) =
    filesMatching(_.endsWith(query))

  def filesContaining(query: String) =
    filesMatching(_.contains(query))

  def filesRegex(query: String) =
    filesMatching(_.matches(query))

  val query = "vi"
  println(filesEnding(query))
}

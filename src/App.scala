import scala.io.Source

object App {
  def main(args: Array[String]) = {
    val words = Source.fromFile("res/words.txt").getLines().map(_.trim).toSet
    val finder = new QwervoragramFinder(words)
    finder.find.foreach(println)
  }
}

import java.io.PrintWriter

import scala.io.Source

object App {
  def main(args: Array[String]) = {
    val words = Source.fromFile("res/words.txt").getLines().map(_.trim).toSet
    val finder = new QwervoragramFinder(words)
    val output = new PrintWriter("output/qwerverograms.txt")
    finder.find.foreach(output.println)
  }
}

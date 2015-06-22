package scala

import scala.io.Source

/**
 * Created by hadoop on 15-6-22.
 * 讀取文件測試
 */
object FileReader {
  def main(args: Array[String]) {
    val file = Source.fromFile("/home/hadoop/IdeaProjects/MyScalaExamples/data/test.txt")
    for (line <- file.getLines()) {
      println(line)
    }
  }

}

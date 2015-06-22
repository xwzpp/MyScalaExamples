package scala

import scala.io.Source

/**
 * Created by hadoop on 15-6-22.
 * For和函数的进阶实战和Lazy的使用
 */
object ForAndFunction {
  def main(args: Array[String]) {
    //for的进阶
    for (i <- 1 to 10; j <- 1 to 10) println(100 * i + j)
    for (i <- 1 to 10; j <- 1 to 10 if i != j) println(100 * i + j)

    //函数的使用
    def addA(x: Int) = x + 100
    val add = (x: Int) => x + 100
    println("The result is " + addA(100))
    println("The result is " + add(2))

    def fac(n: Int): Int = if (n < 0) 1 else n * fac(n - 1)
    println("The result is " + fac(10))

    def conected(args: Int*): Int = {
      var result = 0
      for (arg <- args) {
        result += arg
      }
      result
    }
    println("The result is " + conected(1, 2, 3, 10))

    //使用lazy
    lazy val file = Source.fromFile("/home/hadoop/IdeaProjects/MyScalaExamples/data/test.txt")
    for (line <- file.getLines()) println(line)
  }
}

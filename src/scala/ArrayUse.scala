package scala

import scala.collection.mutable.ArrayBuffer

/**
 * Created by hadoop on 15-6-22.
 * 数组的使用
 */
object ArrayUse {
  def main(args: Array[String]) {
    val nums = new Array[Int](10)
    val a = new Array[String](2)
    val s = Array("hello", "world")
    s(0) = "GoodBye"

    val b = ArrayBuffer[Int]()
    b += 1
    b +=(1, 2, 3, 4, 5)
    b ++= Array(8, 13, 21)
    b.trimEnd(5)
    println(b)
    b.insert(2, 6)
    b.insert(2, 7, 8, 9)
    b.remove(2)
    b.remove(2, 3)
    b.toArray

    for (i <- 0 until a.length) println(i + ":" + a(i))




  }
}

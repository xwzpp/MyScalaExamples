package com.dt.scala.hello
/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
object Map_Tuple {

  def main(args: Array[String]): Unit = {
  val map = Map("book"->10,"gun"->18,"ipad"->1000)  
  for((k,v) <- map) yield (k,v * 0.9)
  
  val scores = scala.collection.mutable.Map("Scala" -> 7, "Hadoop" -> 8, "Spark" -> 10 )
  val hadoopScore = scores.getOrElse("Hadoop", 0)
  scores += ("R" -> 9)
  scores -= "Hadoop"
  
  val sortedScore = scala.collection.immutable.SortedMap("Scala" -> 7, "Hadoop" -> 8, "Spark" -> 10 )
  
  val tuple =(1,2,3.14,"Rocky","Spark")
  val third = tuple._3
  val (first,second,thirda,fourth,fifth) = tuple
  val (f, s, _, _, _) = tuple
  
  "Rocky Spark".partition(_.isUpper)
  
  val symbols = Array("[", "-", "]")
  val counts = Array(2,5,2)
  val pairs = symbols.zip(counts)
  for ((x,y) <- pairs) print(x*y)
  
  }

}
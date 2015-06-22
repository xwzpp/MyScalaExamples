package scala

/**
 * Created by hadoop on 15-6-22.
 * 主要爲Tuple，Array和Map的示例
 */
object TupleAndArrayMapTest {
  def main(args: Array[String]) {
    //Tuple使用
    val pari = (100, "scala", "spark")
    println(pari._1)
    println(pari._2)
    println(pari._3)

    //Map使用
    val mapTest = Map("rockey" -> 20, "hello" -> 30)
    for ((k, v) <- mapTest) {
      println("key is" + k + ",value is" + v)
    }

    //站位符
    for ((k, _) <- mapTest) {
      println("key is" + k)
    }

    //Array的使用
    val array = Array(1, 2, 3, 4, 5)
    for (i <- 0 until array.length) {
      println(array(i))
    }
    //使用加強的FOR循環
    for (elem <- array) {
      println(elem)
    }




  }
}

import scala.collection.mutable

object MutableCollection {

  def main(args: Array[String]): Unit = {

    /**
      * Mutable
      * 객체의 구성요소 값을 변경할 수 있다.
      *
      */

    /**
      * ArrayBuffer
      * 값을 변경할 수 있는 배열
      */
    val arrayBuffer = mutable.ArrayBuffer(1, 2, 3)
    arrayBuffer += 4
    arrayBuffer -= 1
    arrayBuffer ++= List(5, 6, 7)
    println(arrayBuffer)



    /**
      * ListBuffer
      * 값을 변경할 수 있는 Linked List
      */
    val listBuffer = mutable.ListBuffer("a", "b", "c")
    listBuffer +=  "d"
    println(listBuffer)

    /** Mutable Set */
    val hashSet = mutable.Set(0.1, 0.2, 0.3, 0.4)
    hashSet ++= mutable.Set(5)
    println(hashSet)


    /** Mutable Map */
    val hashMap = mutable.Map("one" -> 1, "two" -> 2)
    hashMap ++= Map("three" -> 3, "four" -> 4)
    println(hashMap)




  }
}

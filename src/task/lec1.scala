package task

object lec1 {


  def main(args: Array[String]): Unit = {


    // 함수를 리턴하는 익명 함수  - 클로져
    def mulBy(factor: Double) = (x: Double) => factor * x
    val triple = mulBy(3)     // 함수를 리턴함.  (x: Double) => 3 * x
    val result = triple(2)

    println(result)





  }

}

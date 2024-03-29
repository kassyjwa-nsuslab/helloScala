package task

object MultipleTable {

  /** 연산 case Class */

  class Calculate
  case class Plus(a: Int, b: Int) extends Calculate
  case class Minus(a: Int, b: Int) extends Calculate
  case class Multiple(a: Int, b: Int) extends Calculate
  case class Devision(a: Int, b: Int) extends Calculate

  /**
    * 사칙연산 패턴 정의
    * @param calculate
    * @return
    */
  def defCalculate(calculate: Calculate): Int = {
    calculate match {
      case Plus(a, b) => a + b
      case Minus(a, b) => a - b
      case Multiple(a, b) => a * b
      case Devision(a, b) => a / b
    }
  }


  /**
    * 곱하기 출력 패턴 function
    * @param a
    * @param b
    * @param c
    * @return
    */
  def multiplePattern(a: Int, b: Int, c: Int) : String = {
    a + " * " + b + " = " + c
  }

  /**
    * 구구단 출력 function
    * [ x 단 ]
    * a * b = c
    * @param a
    * @param b
    */
  def printMulipleLine(a: Int, b: Int): Unit ={

    if(b == 1) println(s"[ $a 단 ]")
    println(multiplePattern(a, b, defCalculate( Multiple(a, b) )))
    if(b == 9) println()

  }

  def main(args: Array[String]): Unit = {


    println("[1]. Range ================================ ")
    for(a <- 2 to 9; b <- 1 to 9){

      printMulipleLine(a, b)

    }


    println("[2]. List ================================ ")

    val numberList = (2 to 9).toList
    var multipleLNumList = (1 to 9).toList
    for( a <- numberList; b <- multipleLNumList){
      printMulipleLine(a, b)
    }

    val qqq = numberList.map {
      data =>
        val qqq = data + data * data / data
        qqq + 100
    }
    numberList.foreach(println(_))
    qqq.foreach(println(_))



    println("[3]. Pattern Match ================================ ")



    for(a <- 2 to 9; b <- 1 to 9){
      val s = twoNum(a,b)
      s match {
        case twoNum(a, b) => printMulipleLine(a, b)
        case _ => println("ELSE")
      }

      val aa = Mson("mason",23)

      aa match {
        case Mson(c,d) =>
        case _ =>
      }

    }


    println("[3 - 2]. Pattern Match ================================ ")

    for(a <- 2 to 9; b <- 1 to 9){
      printMulipleLine(a, b)
    }


  }

  case class twoNum(num1: Int, var num2: Int)








}

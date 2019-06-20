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
  def defCalculate(calculate: Calculate): Int ={
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


    println("[3]. Patter Match ================================ ")

    for(a <- 2 to 9; b <- 1 to 9){
      new twoNum(a, b) match {
        case twoNum(a, b) => printMulipleLine(a, b)
        case _ => println("ELSE")
      }
    }


    println("[3 - 2]. Patter Match ================================ ")

    for(a <- 2 to 9; b <- 1 to 9){
      printMulipleLine(a, b)
    }


  }

  case class twoNum(num1: Int, num2: Int)








}

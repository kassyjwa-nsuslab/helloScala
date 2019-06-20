package example

object repeatForExample {

  def main(args: Array[String]): Unit = {

    /**
      * for문을 두번 사용하는 방법
      */
    for( a<- 1 to 3){
      println(a)
      for(b <- 10 to 12){
        println(b)
        println("a,b 답안 : ", a, b)
      }
    }

    // fot문에 여러 개의 range를 세미콜론으로 구분해서 적어주면 중첩for문를 사용한것과 같은 효과를 낸다.

    /**
      * 중첨된 for문 대신 아래와  같이 사용할 수 있다.
      */
    for( a <- 1 to 3; b <- 10 to 12){
      println(a, b)
    }

  }
}

object ListExample {

  def main(args: Array[String]): Unit = {

    /**
      * scala의 기본 List는 immutable (값 불변)
      *
      */

    val list = List("jinny", 90, true)

    // List 값 조회
    val firstItem  =list(0)

    // List는 immutable 이므로, 값을 변경할 수 없음
    //list(2) = 0   // 불가 !!




    // List  붙이기
    // List 앞에 붙이기 :   :: 또는 +:
    // List 끼리 붙이기 :   ++ 또는 :::
    // List 뒤에 붙이기 :   :+

    val concatenated = 0 :: list ++ list :+ 1000
    println(s"$concatenated")
        // 결과 : List(0, jinny, 90, true, jinny, 90, true, 1000)


    // Diff
    val diffList = List(1, 2, 3, 4) diff List(2, 3)
    println(s"$diffList")
        // 결과 :  List(1, 4)



    // find
    val personList = List( ("jinny", 1), ("kassy", 2), ("lucy", 3) )
    def findByName(name: String) = personList.find(_._1 == name).getOrElse("Olivia", 4)
    println( findByName("kassy") )
      // 결과 : (kassy,2)








  }
}

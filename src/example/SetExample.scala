object SetExample {

  def main(args: Array[String]): Unit = {

    // 1. 내용을 수정할 수 없는 set
    val set1 = Set("one", 1)
    val set2 = Set(1,1,4,5,7,7,9,9,9,0)   // 중복이 제거되고 Set(1,4,5,7,9,0) 이 된다.


    // 값이 있는지 체크
    val isExists1 = set1("one")
    val isExists2 = set2(6)
    println(s"isExists1 : $isExists1 , isExists2 : $isExists2")
      // 결과 : isExists1 : true , isExists2 : false


    // Set끼리 합치기
    // - 중복된 내용은 제거된 새로운 Set이 생성
    // - 순서는 보장되지 않음
    val concatenated = set1 ++ set2
    println(concatenated)
      // 결과 : Set(0, 5, 1, 9, 7, 4, one)


    // Diff
    val diffSet = Set(1,2,3,4) diff Set(2,3)
    println( diffSet )
      // 결과 : Set(1, 4)


    // find
    val personSet = Set( ("jinny", 1), ("kassy", 2), ("lucy", 3) )
    def findByName(name: String) = personSet.find(_._1 == name).getOrElse( ("Olivia", 4) )
    val findVal1 = findByName("jinny")
    val findVal2 = findByName("nonperson")

    println(s"findVal1 : $findVal1 , findVal2 : $findVal2")
      // 결과 : findVal1 : (jinny,1) , findVal2 : (Olivia,4)
    println(s"findVal1 : ${findVal1._2} , findVal2 : ${findVal2._2}")
      // 결과 : findVal1 : 1 , findVal2 : 4









  }
}

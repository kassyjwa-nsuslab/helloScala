object MapExample {

  def main(args: Array[String]): Unit = {

    /** Map 선언 */
    val map1 = Map("one" -> 1, "two" -> 2, "three" -> 3)
    val map2 = Map(1 -> "one", "two" -> 2.0, "three" -> false)
    val map3 = Map(1 -> "one", 1 -> 1.0, "three" -> false)    // 중복된 키는 마지막 값을 사용
    val map4 = Map( ("jinny", "one") , ("kassy", "two"), ("lucy", "three") )

    println(map1)
      // 결과 : Map(one -> 1, two -> 2, three -> 3)
    println(map2)
      // 결과 : Map(1 -> one, two -> 2.0, three -> false)
    println(map3)
      // 결과 : Map(1 -> 1.0, three -> false)
    println(map4)
      // 결과 : Map(jinny -> one, kassy -> two, lucy -> three)

    // Map의 값 조회
    val one = map1("one")
    println(one)
      // 결과 : 1



    /** Key값 존재여부 확인 */

    // 존재하지 않는 key값을 조회할 경우 Exception 발생 :   java.util.NoSuchElementException
    //val etcVal = map1("test")
    //println(etcVal)

    // key 존재여부 확인
    val isKeyExist = map1.get("test").isDefined
    println(isKeyExist)
      // 결과 : false



    /** Map 끼리 더하기 */
    val concatenated = map1 ++ map2
    println( concatenated )   // 중복 key 가 제거됨
      // 결과 : Map(one -> 1, two -> 2.0, three -> false, 1 -> one)


    /** find */
    val personMap = Map( ("jinny", "one") , ("kassy", "two"), ("lucy", "three") )

    def findByName(name: String) = personMap(name)    // -> key값이 없는 경우 오류 발생


    val existVal = findByName("kassy")
    //val notExistVal = findByName("Olivia")   // key 값이 없으므로 NoSuchElementException 발생


    def findByName2(name : String) = personMap.getOrElse(name, "notExist")

    val existVal2 = findByName2("kassy")
    val notExistVal2 = findByName2("Olivia")

    println(s"existVal2 : $existVal2, notExistVal2 : $notExistVal2")





















  }
}

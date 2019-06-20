package example

object ArrayExample {

  /**
    * 배열의 내용을 출력하는 메서드
    * @param args
    */
  def printArray[K](array: Array[K]) = {
    println("printArray : " + array.mkString(","))
  }


  def main(args: Array[String]): Unit = {

    // 1. Array[Int]
    val array1 = Array(1, 2, 3)
    println("1. ")
    printArray(array1)


    // 2. Array[Any]     서로 다른 타입도 Array에 담을 수 있다.
    val array2 = Array("a", 2, true)
    println("2. ")
    printArray(array2)


    // 3. 배열의 값을 읽고 쓰기
    val itemAtIndex0 = array1(0)
    println("3. ")
    println("array1의 0번째 value = " + itemAtIndex0)
    array1(0) = 4
    println("array1의 0번째 value 값 변경")
    printArray(array1)


    // 4. 배열과 배열 또는 다른 항목 붙이기
    // 배열을 붙일때는 ++연산자를 이용
    // 엎에 붙일때는 +:, 뒤에 붙일때는 :+ 연산자
    val concatenated = "앞에 붙이기 " +: (array1 ++ array2) :+ "뒤에 붙이기"
    println("4. ")
    printArray(concatenated)
    println(concatenated)     // Array라서.. 값이 출력되지 않음  ([Ljava.lang.Object;@1a407d53)


    // 5. 값으로 Index 찾기
    println("a index : " + array2.indexOf(true))

    val diffArray = Array(1,2,3,4).diff(Array(2,3))
    println("5-1. 다른값")
    printArray(diffArray)

    val diffArray2 = array2.diff(array1)
    printArray(diffArray2)


    // 6. find
    val personArray = Array( ("jinny", 1), ("kassy", 2), ("lucy", 3) )


    /*
      * Array.find
      * _ : Array 의 인자를 하나씩 돌면서 값이 들어감
      */
    def findByName(name:String) = personArray.find(_._1 == name).getOrElse("Olivia", 4)
    val findSolar = findByName("kassy")
    println(findSolar)


    // find( 일치하는 조건 필요 , 괄호 안의 _ 는 array의 각 인자값이다.  )
    val stringArray = Array("솔라", "문별", "휘인")
    def findByName2(name:String) = stringArray.find( _ == name)
    println(findByName2("휘인"))



  }
}

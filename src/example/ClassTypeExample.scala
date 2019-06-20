package example;object ClassTypeExample {

  // 객체 선언
  class Animal()

  // Animal Class 를 상속받는 dog  클래스 선언
  class dog extends Animal()


  def main(args: Array[String]): Unit = {

    // Array 의 구성요소로 dog 클래스와 Animal 클래스가 다 올 수 있는데, array1의 최종 Array 타입은 최상위 레벨인 Animal이다.
    val array1:Array[Animal] = Array(new dog(), new Animal())
    val array2 = Array(new dog(), new Animal())

    // 잘못된  표현
    // val wrongArray:Array[dog] = Array(new dog(), new Animal())


    // List
    val list: List[Animal] = List(new Animal(), new dog())

    // Set
    val set: Set[Animal] = Set(new Animal(), new dog())

    // Map
    val map: Map[String, Animal] = Map( ("Animal", new Animal()), ("dog", new dog()) )

  }
}

object IfExample {

  def main(args: Array[String]): Unit = {

    if(true)
      println("한 줄은 {} << 중괄호 생략 가능")

    /**
      * if / else
      */
    if(1 + 1 == 2) {
      println("1 + 1 = 2")
    }else{
      println("Error")
    }

    /**
      * 삼항연산자
      */
    val likeEggs = false
    val breakfast =
      if(likeEggs) "계란후라이"
      else "사과"

    println(s"아침으로 ${breakfast}를 먹어요")

    if(breakfast == "계란후라이")
      println("11")
    else
      println("22")

  }
}

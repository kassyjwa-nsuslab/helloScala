package example

object PatternMatchExample {

  def main(args: Array[String]): Unit = {

    // matchTest1
    println(matchTest1(4))

    // matchTest2
    println(matchTest2(1))
    println(matchTest2(4))
    println(matchTest2("two"))

    matchTest3()

    matchTest4()

  }


  /**
    * int를 인자값
    * return : String
    * @param x
    * @return
    */
  def matchTest1(x: Int): String = x match{
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case _ => "many"
  }


  /**
    * Any 타입의 match
    * @param x
    * @return
    */
  def matchTest2(x: Any) : Any = x match{
    case 1 => "one"
    case "two" => 2
    case a: Int => "scala.Int"
    case _ => "many"
  }


  def matchTest3() = {

    val alice = new Person("alice", 30)
    val kassy = new Person("kassy", 27)
    val jinny = new Person("kassy", 25)

    kassy match {
      case Person(name, age) => println(kassy.toString())
    }

     println(" for문 ")
    for(p <- List(alice, kassy, jinny)){
      println(p)
    }

    val personList = List(alice, kassy, jinny)
    for(p <- personList){
      println(p)
    }

    for(p <- personList){
      p match {
        case Person("kassy", 27) => println(s" kassy >>> $p")   // 값이 일치하는지 체크
        case Person(name, age) => println(p)                    // 형식이 일치하는지 체크
      }

    }

  }


  /**
    * class 객체로 Pattern Match
    */
  def matchTest4(): Unit ={

    val smsTest = new SMS("kassy", "Please Call Me ! ")
    println(showNotification(smsTest))

  }

  def showNotification(noti: Notification): String = {
    noti match {
      case Email(sender, title, body) =>
        s"You got an email from $sender with title $title"
      case SMS(caller, message) =>
        s"You got an SMS from $caller >> $message"
      case VoiceRecording(cantacName, link) =>
        s"You receive a Voice Recording from $cantacName >> $link"

    }
  }



  case class Person(name: String, age: Int)

  abstract class Notification

  case class Email(sender: String, title: String, body: String) extends Notification

  case class SMS(caller: String, message: String) extends Notification

  case class VoiceRecording(contactName: String, link: String) extends Notification






}

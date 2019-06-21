package task

class Mson(val name: String,val age: Int)

object Mson {
  def apply(name: String, age: Int): Mson = new Mson(name, age)

  def unapply(arg: Mson): Option[(String, Int)] = Some((arg.name, arg.age))

}
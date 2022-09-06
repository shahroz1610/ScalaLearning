package basics

object CBNvsCBV {
  def callByValue(x: Long): Unit = {
    println("Call by value: " + x)
    println("Call by value: " + x)
  }

  def callByName(x: => Long): Unit = {
    println("Call by name: " + x)
    println("Call by name: " + x)
  }

  def main(args: Array[String]): Unit = {
    callByValue(System.nanoTime())
    callByName(System.nanoTime())
  }
}

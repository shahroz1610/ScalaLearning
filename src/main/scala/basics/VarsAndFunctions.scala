package basics

object VarsAndFunctions {
  def greet(name: String, age: Int): String = {
    "Hello, my name is " + name + " and I am " + age + " years old."
  }

  def factorial(num: Int): Int = {
    if (num <= 1) 1
    else num * factorial(num - 1)
  }

  def fibonacci(num: Int): Int = {
    if (num <= 1) num
    else fibonacci(num - 1) + fibonacci(num - 2)
  }

  def isPrime(num: Int): Boolean = {
    def isPrimeTill(n: Int): Boolean = {
      if (n <= 1) true
      else num % n != 0 && isPrimeTill(n - 1)
    }

    isPrimeTill(num / 2)
  }

  def main(args: Array[String]): Unit = {
    println(greet("Shahroz", 23))
    println(factorial(4))
    println(fibonacci(6))
    println(isPrime(11))
  }
}

package basics

import scala.annotation.tailrec


object TailRecursion {

//  To avoid Stack Overflow, it will not store any intermediate results in a Stack.
  @tailrec
  def smartFactorial(num: Int, accumulator: BigInt): BigInt = {
    if (num <= 1) accumulator
    else smartFactorial(num-1, accumulator*num)
  }

  @tailrec
  def smartConcat(s: String, noOfTimes: Int, accumulator: String): String = {
    if (noOfTimes <= 0) accumulator
    else smartConcat(s, noOfTimes-1, accumulator+s)
  }

  def smartIsPrime(num: Int): Boolean = {
    @tailrec
    def smartIsStillPrime(n: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (n <= 1) true
      else smartIsStillPrime(n-1, num%n != 0 && isStillPrime)
    }
    smartIsStillPrime(num/2, true)
  }

  @tailrec
  def smartFibonacci(num: Int, accumulator1: Int, accumulator2: Int): Int = {
    if (num <= 2) accumulator2
    else smartFibonacci(num-1, accumulator2, accumulator2+accumulator1)
  }

  def main(args: Array[String]): Unit = {
    println(smartConcat("Shahroz ", 4, ""))
    println(smartFactorial(5000, 1))
    println(smartIsPrime(11))
    println(smartFibonacci(6, 1,1))
  }
}

import scala.math._

object Calculator {
  def add(a: Int, b: Int): Int = {
    a + b

  }

  def subtract(a: Int, b: Int): Int = {
    a - b
  }

  def multiply(a: Int, b: Int): Int = {
    a * b
  }
  def divide(a: Double, b: Int): Double = {
      require(b!=0)
      a / b

  }

  def power(a: Int, b: Int): Double = {
    pow(a, b)
  }

  def absolute(a: Int): Int = {
    if (a < 0) (a * -1) else a
  }

  def modulus(a: Int, b: Int): Int = {
    a % b
  }

  def maxTwo(a: Int, b: Int): Int = {
    if (a > b) a else b
  }

  def minTwo(a: Int, b: Int): Int = {
    if (a < b) a else b
  }



}

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CalculatorTest extends AnyFlatSpec with Matchers {

  // Addition
  "Add (3, 3)" should "return 6" in {

    Calculator.add(3, 3) shouldEqual 6
  }

  "Add (-3, -3)" should "return 6" in {

    Calculator.add(-3, -3) shouldEqual -6
  }

  //Subtraction

  "Subtract (3, 3)" should "return 0" in {

    Calculator.subtract(3, 3) shouldEqual 0
  }

  "Subtract (-3, -3)" should "return 0" in {

    Calculator.subtract(-3, -3) shouldEqual 0
  }

  // Multiplication

  "Multiply (3, 3)" should "return 9" in {

    Calculator.multiply(3, 3) shouldEqual 9

  }

  "Multiply (-3, -3)" should "return 9" in {

    Calculator.multiply(3, 3) shouldEqual 9

  }


  // Division

  "Divide (3, 3)" should "return 1" in {

    Calculator.divide(3, 3) shouldEqual 1

  }

  "Divide (-3, -3)" should "return 1" in {

    Calculator.divide(-3,-3) shouldEqual 1

  }


 // Power

  "Power (3, 3)" should "return 27" in {

    Calculator.power(3, 3) shouldEqual 27

  }

  "Power (-3, -3)" should "return -0.037037037037037035" in {

    Calculator.power(-3, -3) shouldEqual -0.037037037037037035

  }

  // Absolute

  "Absolute (3)" should "return 3" in {

    Calculator.absolute(3) shouldEqual 3

  }

  "Absolute (-3)" should "return 3" in {

    Calculator.absolute(-3) shouldEqual 3

  }

  // Modulus

  "Modulus (3,3)" should "return 0" in{
    Calculator.modulus(3,3) shouldEqual 0
  }

  "Modulus (-3,-3)" should "return 0" in{
    Calculator.modulus(3,3) shouldEqual 0
  }

  // Maximum of Two
  "Maximum of (1, 3)" should "return 3" in {

    Calculator.maxTwo(1, 3) shouldEqual 3

  }

  "Maximum of (3,1)" should "return 3" in {

    Calculator.maxTwo(3, 1) shouldEqual 3

  }

  // Minimum of two
  "Minimum of (3,1)" should "return 3" in {

    Calculator.minTwo(3, 1) shouldEqual 1

  }

  "Minimum of  (1,3)" should "return 3" in {

    Calculator.minTwo(1,3) shouldEqual 1

  }

}
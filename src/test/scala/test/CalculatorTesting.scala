package test

import com.sample.Calculator
import org.scalatest.funspec.AnyFunSpec


class CalculatorTesting extends AnyFunSpec {

  val calculator = new Calculator()

  describe("addition") {
    it("returns the expected output") {
      assert(calculator.addition(3, 2) == 5)
      assert(calculator.addition(3, -2) == 1)
      assert(calculator.addition(-2, 0) == -2)
      assert(calculator.addition(0, 0) == 0)
      assert(calculator.addition(0, 2) == 2)


    }
  }

  describe("subtraction") {
    it("returns the expected output") {
      assert(calculator.subtraction(3, 2) == 1)
      assert(calculator.subtraction(-3, 2) == -5)
      assert(calculator.subtraction(-3, -2) == -1)
      assert(calculator.subtraction(0, 0) == 0)
      assert(calculator.subtraction(0, 2) == -2)

    }
  }

  describe("multiplication") {
    it("should give back 0 if multiplying by 0") {
      assert(calculator.multiplication(880, 0) == 0)
      assert(calculator.multiplication(-45826, 0) == 0)
      assert(calculator.multiplication(0, 0) == 0)
    }
  }

  describe("division") {
    it("should throw a error while dividing by zero ") {
      assertThrows[ArithmeticException](calculator.division(789654, 0))
      assertThrows[ArithmeticException](calculator.division(-654, 0))
    }
  }

  describe("modulus") {
    it("should throw a error while modulus by zero ") {
      assertThrows[ArithmeticException](calculator.division(754, 0))
      assertThrows[ArithmeticException](calculator.division(-54, 0))
      assert(calculator.modulo(8,8) == 0)
      assert(calculator.modulo(-4,-9) == -4)
      assert(calculator.modulo(0,9) == 0)

    }
  }
}






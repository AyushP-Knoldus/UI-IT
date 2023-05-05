package com.knoldus.dataValidatorTest

import com.knoldus.dataValidator.Factorial
import org.scalatest.funsuite.AnyFunSuiteLike

class FactorialTest extends AnyFunSuiteLike {
  val factorial = new Factorial

  test("for negative value result factorial should print a message") {
    assert(factorial.findFactorial(-3, 0) == 0)
  }
  test("if element value is zero result well be 1") {
    assert(factorial.findFactorial(1, 1) == 1)
  }
  test("for positive value result of factorial will print ") {
    assert(factorial.findFactorial(5, 1) == 120)
  }

}

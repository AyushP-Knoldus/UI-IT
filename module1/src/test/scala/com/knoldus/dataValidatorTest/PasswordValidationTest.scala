package com.knoldus.dataValidatorTest

import com.knoldus.dataValidator.PasswordValidation
import org.scalatest.funsuite.AnyFunSuite

class PasswordValidationTest extends AnyFunSuite {

  val passwordValidatorObj = new PasswordValidation
  test("Method passwordvalidator return true if valid password is used and doesn't contains username in password") {
    assert(passwordValidatorObj.passwordvalidator("Ayush", "ayush@gmail.com", "CheckingPass@123"))
  }
  test("should return false as password doesn't contains Uppercase") {
    assert(!passwordValidatorObj.passwordvalidator("Ayush", "ayush@gmail.com", "checkingpass@123"))
  }
  test("should return false as password doesn't contains lowercase") {
    assert(!passwordValidatorObj.passwordvalidator("Ayush", "ayush@gmail.com", "CHECKINGPASS@123"))
  }
  test("should return false as password doesn't contains numbers") {
    assert(!passwordValidatorObj.passwordvalidator("Ayush", "ayush@gmail.com", "CheckingPass@"))
  }
  test("should return false as password doesn't contains symbols") {
    assert(!passwordValidatorObj.passwordvalidator("Ayush", "ayush@gmail.com", "CheckingPass123"))
  }
  test("should return false as password contains username in password") {
    assert(!passwordValidatorObj.passwordvalidator("Ayush", "ayush@gmail.com", "Ayush@123"))
  }
  test("should return false as password length is less than eight characters") {
    assert(!passwordValidatorObj.passwordvalidator("Ayush", "ayush@gmail.com", "Ayush@1"))
  }
}
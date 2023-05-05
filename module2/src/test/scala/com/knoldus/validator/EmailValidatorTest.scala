package com.knoldus.validator

import org.scalatest.funsuite.AnyFunSuite

class EmailValidatorTest extends AnyFunSuite {

  val emailValidator = new EmailValidator

  test("Method emailIdIsValid should should return true if email is valid") {
    val email = "ayush@gmail.com"
    val result = emailValidator.emailIdIsValid(email)
    assert(result)
  }

  test("Method emailIdIsValid should return true if . can be added before @") {
    val email = "ayush.pathak@gmail.com"
    val result = emailValidator.emailIdIsValid(email)
    assert(result)
  }

  test("Method emailIdIsValid should return true as email can have numbers") {
    val email = "ayush.pathak06@gmail.com"
    val result = emailValidator.emailIdIsValid(email)
    assert(result)
  }

  test("Method emailIdIsValid should return false as @ is not present") {
    val email = "ayush.pathakgmail.com"
    val result = emailValidator.emailIdIsValid(email)
    assert(!result)
  }

  test("Method emailIdIsValid should return false as domain is not present") {
    val email = "ayush.pathak06@"
    val result = emailValidator.emailIdIsValid(email)
    assert(!result)
  }

}

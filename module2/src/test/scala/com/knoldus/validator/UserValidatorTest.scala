package com.knoldus.validator

import org.scalatest.funsuite.AnyFunSuite
import com.knoldus.models.User

class UserValidatorTest extends AnyFunSuite {

  val userValidator = new UserValidator

  test("Method userIsValid should return true as company name already exist and email is valid") {
    val user: User = User("Ayush", "Pathak", 23, 25000.0, "Intern", "Knoldus", "ayush.pathak@knoldus.com")
    val result = userValidator.userIsValid(user)
    assert(result)
  }

  test("Method userIsValid should return false as company name doesn't exist") {
    val user = User("Arpit", "Jain", 22, 20000.0, "Developer", "Synergy Lab", "arpit@synergy.com")
    val result = userValidator.userIsValid(user)
    assert(!result)
  }

  test("Method userIsValid should return false as company name exist but emailid is not valid") {
    val user = User("Sonu", "Soni", 25, 50000.0, "SDE", "Philips", "@philips.com")
    val result = userValidator.userIsValid(user)
    assert(!result)
  }
}
package com.knoldus.request

import org.scalatest.funsuite.AnyFunSuite
import com.knoldus.models.User
import com.knoldus.validator.UserValidator

class UserImplTest extends AnyFunSuite {

  val userValidator = new UserValidator
  val userImpl = new UserImpl(userValidator)

  test("Method createUser should return a valid emailid") {
    val user: User = User("Ayush", "Pathak", 23, 25000.0, "Intern", "Knoldus", "ayush.pathak@knoldus.com")
    val result = userImpl.createUser(user)
    assert(result.contains(user.emailId))
  }

  test("Method createUser should return none because Company Name doesn't exist") {
    val user = User("Arpit", "Jain", 22, 20000.0, "Developer", "Synergy Lab", "arpit@synergy.com")
    val result = userImpl.createUser(user)
    assert(result.isEmpty)
  }

  test("Method createUser should return none as emailid is not valid") {
    val user = User("Sonu", "Soni", 25, 50000.0, "SDE", "Infenion", "@infenion.com")
    val result = userImpl.createUser(user)
    assert(result.isEmpty)
  }

}
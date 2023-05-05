package com.knoldus.validator

import org.scalatest.funsuite.AnyFunSuite
import com.knoldus.models.Company

class CompanyValidatorTest extends AnyFunSuite {

  val companyValidator = new CompanyValidator

  test("Method companyIsValid should return true as new company doesn't exist and have valid emailid") {
    val newCompany: Company = Company("Wipro", "wipro@gmail.com", "Noida")
    val result = companyValidator.companyIsValid(newCompany)
    assert(result)
  }

  test("Method companyIsValid should return false as company already exist") {
    val newCompany: Company = Company("Philips", "philips@gmail.com", "Noida")
    val result = companyValidator.companyIsValid(newCompany)
    assert(!result)
  }

  test("Method companyIsValid should return false as emaild is not valid") {
    val newCompany = Company("Accenture", "accenture.gmail.com", "Delhi")
    val result = companyValidator.companyIsValid(newCompany)
    assert(!result)
  }
}
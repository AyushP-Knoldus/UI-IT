package com.knoldus.request

import org.scalatest.funsuite.AnyFunSuite
import com.knoldus.models.Company
import com.knoldus.validator.CompanyValidator

class CompanyImplTest extends AnyFunSuite {

  val companyValidator = new CompanyValidator
  val companyImpl = new CompanyImpl(companyValidator)

  test("Method createCompany should return valid company name") {
    val company: Company = Company("Wipro", "wipro123@gmail.com", "Noida")
    val result = companyImpl.createCompany(company)
    assert(result.contains(company.name))
  }

  test("Method createCompany should return none as the company already present in database") {
    val company: Company = Company("Knoldus", "wipro123@gmail.com", "Noida")
    val result = companyImpl.createCompany(company)
    assert(result.isEmpty)
  }

  test("Method createCompany should return None as invalid email has been provided") {
    val company: Company = Company("Accenture", "accenture.gmail.com", "Noida")
    val result = companyImpl.createCompany(company)
    assert(result.isEmpty)
  }
}
package com.knoldus.db

import com.knoldus.models.Company
import org.scalatest.funsuite.AnyFunSuite

class CompanyReadDtoTest extends AnyFunSuite {

  val companyReadDto: CompanyReadDto = new CompanyReadDto
  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val philipsCompany: Company = Company("Philips", "philips123@gmail.com", "Noida")

  test("Method getCompanyByName should return the company for a Knoldus company details") {
    val result = companyReadDto.getCompanyByName("Knoldus")
    assert(result.contains(knoldusCompany))
  }

  test("Method getCompanyByName should return the company for a valid Philips company details") {
    val result = companyReadDto.getCompanyByName("Philips")
    assert(result.contains(philipsCompany))
  }

  test("Method getCompanyByName should return None for an invalid company name") {
    val result = companyReadDto.getCompanyByName("Invalid Company")
    assert(result.isEmpty)
  }

  test("Method getCompanyByName should return None for a null company name") {
    val result = companyReadDto.getCompanyByName(null)
    assert(result.isEmpty)
  }

  test("Method getCompanyByName should return None for an empty company name") {
    val result = companyReadDto.getCompanyByName("")
    assert(result.isEmpty)
  }

}

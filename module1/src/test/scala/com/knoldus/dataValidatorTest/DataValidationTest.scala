package com.knoldus.dataValidatorTest

import com.knoldus.dataValidator.DataValidation
import org.scalatest.funsuite.AnyFunSuite

class DataValidationTest extends AnyFunSuite {

  val dataValidation = new DataValidation

  test("Method isContainsDuplicateElement should return true in case of duplicates.") {
    val inputList = List(2, 99, 10, 5, 2)
    val result = dataValidation.isContainsDuplicateElement(inputList)
    assert(result)
  }

  test("Method isContainsDuplicateElement return false if a list does not contain duplicate elements") {
    val inputList = List(1, 2, 3, 4, 5)
    val result = dataValidation.isContainsDuplicateElement(inputList)
    assert(!result)
  }

  test("return false if an empty list is passed as input") {
    val inputList = List.empty[Int]
    val result = dataValidation.isContainsDuplicateElement(inputList)
    assert(!result)
  }
}


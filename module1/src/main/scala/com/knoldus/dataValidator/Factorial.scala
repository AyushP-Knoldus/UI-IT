package com.knoldus.dataValidator

import org.slf4j.LoggerFactory

class Factorial {

  private val logger = LoggerFactory.getLogger(getClass)

  def findFactorial(element: Int, value: Int): Int = {
    if (element <= 0) {
      logger.info("Value must be greater than zero in order to find factorial")
      0
    } else if (element == 1) {
      logger.info(s"Factorial value is: $value")
      value
    } else {
      findFactorial(element - 1, value * element)
    }
  }

}

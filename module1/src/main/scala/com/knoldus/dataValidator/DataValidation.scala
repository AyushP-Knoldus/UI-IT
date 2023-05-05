package com.knoldus.dataValidator

import org.slf4j.LoggerFactory

class DataValidation {
  private val logger = LoggerFactory.getLogger(getClass)

  def isContainsDuplicateElement[T](list: List[T]): Boolean = {

    def removeDuplicates(list: List[T]): List[T] = list match {
      case Nil => List.empty[T]
      case head :: tail => head :: removeDuplicates(tail.filter(_ != head))
    }

    val distinctList = removeDuplicates(list)
    val result = distinctList.length != list.length

    logger.info(s"Input list: $list")
    logger.info(s"Distinct list: $distinctList")
    logger.info(s"Result: $result")

    result
  }
}
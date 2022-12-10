package com.td.implicits



object OptionHelpers {

  // 1: Implement this function
  def naiveAdd(option1: Option[Int], option2: Option[Int]): Option[Int] = {
    if(option1.isEmpty) {
      return None
    }
    if(option2.isEmpty) {
      return option1
    }
    Some(option1.get + option2.get)
  }

  implicit class RichOption(val b: Option[Int]) {
    def plus(value: Option[Int]): Option[Int] = {
      value match {
        case None => b
        case Some(x) => Some(x + b.get)
      }
    }

    def +(value: Int): Option[Int] = {
      Some(value + b.get)
    }
  }

  implicit class RichNone(val b: Option[Nothing]) {
    def plus(value: Option[Int]): Option[Int] = {
      None
    }

    def +(value: Int): Option[Int] = {
      None
    }
  }
}

package com.td.scala.recursion

import scala.annotation.tailrec

object BalancingChecker {

  /** This methdod checks that the parenthesis in the input are balanced */
  @tailrec
  def isBalanced(code: String): Boolean = {
    if(code == "") {
      true
    } else if(code(0) == '(' && code(code.length - 1) == ')') {
      code.length > 1 && isBalanced(code.substring(1, code.length - 1))
    } else {
      false
    }
  }
}

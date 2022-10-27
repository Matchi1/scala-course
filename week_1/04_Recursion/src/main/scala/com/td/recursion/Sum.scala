package com.td.recursion

object Sum {

  def closedForm(n: Long): Long = n

  def recursive(n: Long): Long = {
    if (n == 0) {
      0
    } else {
      recursive(n - 1) + 1
    }
  }

  def tailrecursive(n: Long): Long = {
    if(n == 0) {
      0
    } else {
      1 + recursive(n - 1)
    }
  }

}

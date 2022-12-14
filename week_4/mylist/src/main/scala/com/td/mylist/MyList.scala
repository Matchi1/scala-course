package com.td.mylist

import scala.runtime.Nothing$

sealed abstract class MyList[+A] {
  def isEmpty(): Boolean = length == 0

  // example of using inheritance style
  def length: Int

  // Tyepsafe
  def firstElement: Option[A] = None

  def remainingElements: MyList[A] = MyList.initEmpty()

  def toPrint: String = ""

  def map[B](f: A => B): MyList[B]

  def addElement[B >: A](a: B): MyList[B] = MyList(a)
}

case object End extends MyList[Nothing] {
  def length: Int = 0

  // Nothing makes very clear that there is nothing to map
  def map[B](f: Nothing => B): MyList[B] = MyList.initEmpty()
}

case class Element[T](value: T, next: MyList[T]) extends MyList[T] {
  def length: Int                  = 1 + next.length
  def map[B](f: T => B): MyList[B] = Element(f(value), next.map(f))

  override def firstElement: Option[T] = Some(value)
  override def remainingElements: MyList[T] = next
  override def toPrint: String = {
    if(next.isEmpty()) {
      s"${value}"
    } else {
      s"${value}, " + next.toPrint
    }
  }
  override def addElement[B >: T](a: B): MyList[B] = Element(a, this)

}

// Companion object
object MyList {
  def initEmpty(): MyList[Nothing] = End

  def init[T](values: T*): MyList[T] = {
    def helper(accumulator: MyList[T], index: Int, array: Seq[T]): MyList[T] =
      if (index == 0) {
        Element(array.apply(index), accumulator)
      } else {
        helper(
          Element(array.apply(index), accumulator),
          index - 1,
          array
        )
      }

    if (values.length > 0) helper(End, values.length - 1, values)
    else End
  }

  def apply[T](values: T*): MyList[T] = init(values: _*)
}

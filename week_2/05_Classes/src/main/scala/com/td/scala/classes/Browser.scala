package com.td.scala.classes

import scala.util.hashing.{Hashing, MurmurHash3}


// create a class Browser
class Browser(version: Double, kind: String, platform: Seq[String]) {
  def canEqual(a: Any): Boolean = a.isInstanceOf[Browser]

  // Defining equals method with override keyword
  override def equals(that: Any): Boolean =
  that match
  {
    case that: Browser => that.canEqual(this) && this.hashCode == that.hashCode
    case _ => false
  }

  override def hashCode: Int = {
    MurmurHash3.setHash(Set(version, kind, platform))
  }

  def getVersion: Double = version
}

object Browser {
  def apply(version: Double, kind: String, platform: Seq[String]): Browser = new Browser(version, kind, platform)
}

/**
 * References:
 *
 * https://www.geeksforgeeks.org/object-equality-in-scala/
 */

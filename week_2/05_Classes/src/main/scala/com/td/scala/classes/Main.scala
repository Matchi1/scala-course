package com.td.scala.classes

object Main extends App {
  val firefox1 = new Browser(1.0, "Firefox", Seq("Windows", "MacOs", "Linux"))
  val opera1 = new Browser(0.4, "Opera", Seq("MacOs"))
  val chrome1 = new Browser(2.4, "Chrome", Seq("Windows", "Linux"))
  val chrome2 = new Browser(2.4, "Chrome", Seq("Windows", "Linux"))
  val chrome3 = new Browser(2.5, "Chrome", Seq("Windows", "Linux"))
  
  println(s"firefox and opera ${firefox1.equals(opera1)}")
  println(s"chrome 1 & 2 ${chrome1.equals(chrome2)}")
  println(s"chrome 3 version: ${chrome3.getVersion}")

  val custom = Browser.apply(4.0, "Custom", Seq("Windows", "Linux"))
  println(s"Custom version: ${custom.getVersion}")
}

/**
 * What do you notice ? 
 *
 * Chrome 1 & 2 are not the equals even though they are the same
 *
 * What can we do to improve this behavior ? (What would you do in Java?)
 *
 * Override equals and hashcode
 */

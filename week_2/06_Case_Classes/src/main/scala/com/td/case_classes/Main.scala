package com.td.case_classes

object Main extends App {

  val firefox = Browser(1.0, "Firefox", Seq("Windows", "MacOs", "Linux"))
  val chrome  = Browser(2.4, "Chrome", Seq("Windows", "Linux"))
  val opera   = Browser(0.4, "Opera", Seq("MacOs"))

  println((firefox.equals(chrome)))
  println((chrome.equals(chrome)))

  //new version of chrome

  val chrome1 = Browser(2.4, "Chrome", Seq("Windows", "Linux"))
  println((chrome.equals(firefox)))
  println((chrome == firefox))
  println((chrome.equals(chrome1)))
  println((chrome == chrome1))

  val chrome2 = chrome.copy(2.5)
  println(chrome2.version)
}

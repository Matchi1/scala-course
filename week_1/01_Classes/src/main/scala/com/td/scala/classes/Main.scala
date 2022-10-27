package com.td.scala.classes

object Main extends App {
  val car = new Car(4, "red", 5)
  car.speedUp(10)
  car.brake(5)
  println(car)
  val other = new Car()
  println(other)
  other.speedUp(-1)
}

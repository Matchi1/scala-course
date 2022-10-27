package com.td.scala.functional_types._1

object Main extends App {

  println("Improve the code of the class Car in a functional way")

  val car1 = new Car(3, "white", 4)

  println(car1.color)

  car1.speedUp(10) match {
    case Left(error) => println(error)
    case Right(c) => {
      println(c.speed)

      c.brake(-8) match {
        case Left(error) => println(error)
        case Right(c) => println(c.speed)
      }
    }
  }

}

package com.td.scala.functional_types._2

import com.td.scala.functional_types._2.constructor.CarConstructor

object Main extends App {

  println("Implement here several kind of searchs")


  // question 1
  val car = CarConstructor.searchCarById(1)
  car match {
    case Some(value) => println(value.color)
    case None => println("Do not exist")
  }
  //question 2
  val cars = CarConstructor.searchCarsByColor(CarConstructor.Green)
  val total = cars.foldLeft(0)((acc:Int, c:Car) => acc + c.nbPlaces)
  println(total)
}

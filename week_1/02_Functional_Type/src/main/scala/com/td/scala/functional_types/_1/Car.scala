package com.td.scala.functional_types._1

class Car(val nbDoor: Int, val color: String, val nbPlaces: Int, val speed: Int = 0) {

  def speedUp(s: Int): Either[String,Car] = {
    if (s <= 0) Left("Speed must be greater than 0")
    else Right(new Car(nbDoor, color, nbPlaces, s + speed))
  }

  def brake(s: Int): Either[String,Car] = {
    if (s <= 0) Left("Speed must be greater than 0")
    else Right(new Car(nbDoor, color, nbPlaces, s + speed))
  }
}

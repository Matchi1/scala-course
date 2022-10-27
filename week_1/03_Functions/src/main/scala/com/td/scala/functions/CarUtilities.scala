package com.td.scala.functions

object CarUtilities {

  /** Price mustn't appear, only color, nbDoor, nbPlaces* */
  val technicalFormat: Car => String = {
    car => "Color: " + car.color + ", Doors: " + car.nbDoor + ", Places: " + car.nbPlaces
  }

  /** All caracteristics must me displayed* */
  val showRoomFormat: Car => String = {
    car => "Price: " + car.price + ", Color: " + car.color + ", Doors: " + car.nbDoor + ", Places: " + car.nbPlaces
  }

  /** Multiply parameter by 10* */
  val maxiTurbo: Int => Int = value => value * 10

  /** Multiply parameter by 2* */
  val softTurbo: Int => Int = value => value * 2

}

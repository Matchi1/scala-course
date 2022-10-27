package com.td.scala.classes

class Car(nbDoor: Int, var color: String, val nbPlaces: Int, var speed: Int = 0) {
  def this() = this(4, "blue", 7)

  def speedUp(value: Int): Unit = {
    if(value < 0) {
      throw new IllegalArgumentException("value should be positive")
    }
    this.speed += value
    println("Car speeding up to " + this.speed)
  }

  def brake(value: Int): Unit = {
    if (value < 0) {
      throw new IllegalArgumentException("value should be positive")
    }
    this.speed -= value
    println("Car braking to " + this.speed)
  }

  override def toString: String = "Doors : " + nbDoor + ", color : " + color + ", places : " + nbPlaces
}

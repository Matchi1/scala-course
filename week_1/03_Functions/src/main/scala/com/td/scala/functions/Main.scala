package com.td.scala.functions

import com.td.scala.functions.constructor.CarConstructor

object Main extends App {

  println("Prepare characteristic sheets (technical) for all green car")
  val greens = CarConstructor.searchCarsByColor(CarConstructor.Green).map(CarUtilities.technicalFormat)
  greens.foreach(println)

  println("Prepare characteristic sheets (showroom) for all pink car")
  val pinks = CarConstructor.searchCarsByColor(CarConstructor.Pink).map(CarUtilities.showRoomFormat)
  pinks.foreach(println)

  println("""Build a concept car that embeded a turbo that make it the faster car in the world
      |when the pilot speed up, its speed rise up by 10 times than standard car
      |""".stripMargin)

  CarConstructor.searchCarById(8) match {
    case Some(c) =>
      c.speedUp(1, CarUtilities.maxiTurbo) match {
        case Left(err) => println(err)
        case Right(c) => println(c.speed)
      }
    case None => println("Do not exist")
  }

  println("""Build a standard car that embeded a turbo that make it the luxurious car in the world
      |when the driver speed up, its speed rise up by 2 times
      |""".stripMargin)

  CarConstructor.searchCarById(13) match {
    case Some(c) =>
      c.speedUp(1, CarUtilities.softTurbo) match {
        case Left(err) => println(err)
        case Right(c) => println(c.speed)
      }
    case None => println("Do not exist")
  }
}

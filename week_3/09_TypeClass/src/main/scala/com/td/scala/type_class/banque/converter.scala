package com.td.scala.type_class.banque

object converter {

  sealed trait Currency {
    val amount: Double
    val symbol: String
    def display: String =
      s"Montant ${amount} $symbol"
  }

  object Currency {

    case class EUR(amount: Double) extends Currency {
      override val symbol: String = "EURO"
    }

    case class DOL(amount: Double) extends Currency {
      override val symbol: String = "$"
    }

    case class YEN(amount: Double) extends Currency {
      override val symbol: String = "Y"
    }

    // add your own currency
  }

  trait Converter[A, B] {
    def change(amount: A): B
  }

  object converters {

    // provide implicits converters Currency based on trait converter[A,B]

  }

}
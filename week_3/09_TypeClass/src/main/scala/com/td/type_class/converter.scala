package com.td.type_class

import com.td.type_class.converter.Currency.{CUST, EUR, JPN, PND, USD}

object converter {

  sealed trait Currency {
    val amount: Double
    val symbol: String
    def display: String =
      s"Montant $amount $symbol"
  }

  object Currency {

    case class EUR(amount: Double) extends Currency {
      override val symbol: String = "€"
    }

    case class USD(amount: Double) extends Currency {
      override val symbol: String = "$"
    }

    case class JPN(amount: Double) extends Currency {
      override val symbol: String = "¥"
    }

    case class PND(amount: Double) extends Currency {
      override val symbol: String = "P"
    }

    case class CUST(amount: Double) extends Currency {
      override val symbol: String = "C"
    }

  }

  trait Converter[A, B] {
    def change(amount: A): B
  }

  object converters {
    object Converter {
      implicit object USDToEUR extends Converter[USD, EUR] {
        override def change(amount: USD): EUR = EUR(amount.amount * 1.5)
      }
      implicit object EURToUSD extends Converter[EUR, USD] {
        override def change(amount: EUR): USD = USD(amount.amount * 0.5)
      }
      implicit object JPNToEUR extends Converter[JPN, EUR] {
        override def change(amount: JPN): EUR = EUR(amount.amount * 0.0069)
      }
      implicit object PNDToEUR extends Converter[PND, EUR] {
        override def change(amount: PND): EUR = EUR(amount.amount * 1.16)
      }
      implicit object JPNToCUST extends Converter[JPN, CUST] {
        override def change(amount: JPN): CUST = CUST(amount.amount * 0.0001)
      }
    }

  }

}

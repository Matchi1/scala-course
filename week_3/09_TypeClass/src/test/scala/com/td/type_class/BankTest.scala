package com.td.type_class

import com.td.type_class.converter.converters.Converter.USDToEUR
import org.scalatest._
import org.scalatest.flatspec._
import org.scalatest.matchers._

class BankTest extends AnyFlatSpec with should.Matchers {

  import com.td.type_class.converter.Currency.{EUR, USD}
  import com.td.type_class.converter.converters.Converter._

  "Currency exchange" should "convert correctly" in {
    LaNef().exchange(USD(12.0)) should be(EUR(18.0))
  }

}

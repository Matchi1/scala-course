package com.td.type_class

import com.td.type_class.converter.Currency.{EUR, JPN, USD}
import com.td.type_class.converter.converters.Converter._
import com.td.type_class.converter.converters.Converter
import com.td.type_class.converter.converters.Converter.EURToUSD

object Main extends App{
  println(Converter.EURToUSD.change(EUR(250)).display)
  println(Converter.JPNToCUST.change(JPN(10000)).display)
}

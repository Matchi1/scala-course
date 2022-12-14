package com.td.fold

import java.time.{LocalDateTime, ZoneOffset}

object Monitor {

  // TODO: deserialize the dates from Data.trips to LocalDateTime
  // DO NOT WRITE a helper function like:
  // def parse(list: List[List[(String, String)]]): List[List[(LocalDateTime, LocalDateTime)]] =
  // but
  // TODO: implement a function parse: ((String, String)) => (LocalDateTime, LocalDateTime)
  val parse: ((String, String)) => (LocalDateTime, LocalDateTime) = a => Tuple2(LocalDateTime.parse(a._1), LocalDateTime.parse(a._2))

  // TODO: implement a function parse: ((String, String)) => (LocalDateTime, LocalDateTime)
  val duration: ((LocalDateTime, LocalDateTime)) => Long = a => {
    (a._2.toEpochSecond(ZoneOffset.UTC) - a._1.toEpochSecond(ZoneOffset.UTC))
  }

}

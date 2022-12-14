package com.td.fold

import java.time.LocalDateTime

object Main extends App {
  // See Data.trips and Data.names

  // Parse the String to LocalDateTime and then compute the duration of each trip
  val tripsDuration: List[List[Long]] = {
    Data.trips.map(ll => ll.map(Monitor.parse)).map(ll => ll.map(Monitor.duration))
  }

  // Find the duration of the longest trip
  // result: 59280 seconds
  val longestTripOfAll: Long = tripsDuration.map(a => if(a.nonEmpty) a.max else 0).max
  assert(longestTripOfAll == 59280, s"expected ${59280}, got ${longestTripOfAll}")

  // Zip trips and names
  val tripsAndName: List[(List[Long], String)] = tripsDuration.zip(Data.names)

  // Find the name and the number of trip for the cyclist with the biggest number of trips
  // Hint: tripsAndName.foldLeft
  // result: (Kara, 6)
  val top1ByNumberOfTrips: (String, Int) = {
    tripsAndName.foldLeft(Tuple2.apply("", 0))((acc, data) => {
      if(acc._2 < data._1.size) {
        Tuple2(data._2, data._1.size)
      } else {
        acc
      }
    })
  }
  assert(top1ByNumberOfTrips == Tuple2("Kara", 6), s"expected ${Tuple2("Kara", 6)}, got ${top1ByNumberOfTrips}")
}

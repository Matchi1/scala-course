package com.td.scala.adt._1.adt

sealed trait types
object types {
  sealed trait Kind
  sealed trait Platform
  case object Kind extends types {
    case object Firefox extends Kind
    case object Chrome extends Kind
    case object IE extends Kind
    case object Opera extends Kind
    case object Safari extends Kind
  }
  case object Platform extends types {
    case object Windows extends Platform
    case object Linux extends Platform
    case object MacOs extends Platform
  }

}

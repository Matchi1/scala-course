package com.td.scala.adt._3

import com.td.scala.adt._3.adt.types.platform.Windows
import com.td.scala.adt._3.adt.types.kind.{Chrome, Firefox, IE, Opera}
import com.td.scala.adt._3.adt.types.platform.Linux
import com.td.scala.adt._3.utils.DB

object Main extends App {

  // implement predicated here

  // select all Firefox browsers
  DB.getBrowser(b => b.kind == Firefox)

  //  select all Chrome browsers compliant with Windows platform
  DB.getBrowser(b => b.kind == Chrome && b.platform.contains(Windows))

  // select all browser with version equals to 1.0
  DB.getBrowser(b => b.version == 1.0)

  //select all Opera and IE browsers
  DB.getBrowser(b => b.kind == Chrome || b.kind == IE)

  // select Chrome browser with version 3.4 and compliant with Linux Platform
  DB.getBrowser(b => b.version == 3.4 && b.kind == Chrome && b.platform.contains(Linux))

}

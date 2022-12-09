package com.td.scala.adt._2.utils

import com.td.scala.adt._2.Browser

object ReleaseManager {

  def releaseVersion(currentBrowser: Browser, newVersion: Double): Browser = currentBrowser.copy(newVersion)

}

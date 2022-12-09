package com.td.case_classes

case class Browser(val version: Double, val kind: String, val platform: Seq[String]) {

  def canEqual(other: Any): Boolean = other.isInstanceOf[Browser]

  override def equals(other: Any): Boolean = other match {
    case that: Browser =>
      (that canEqual this) &&
        version == that.version &&
        kind == that.kind &&
        platform == that.platform
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(version, kind, platform)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}

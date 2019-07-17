package io.github.lashchenko

trait StringToNumberOps {

  def stringToInt(s: String): Int = s.toInt
  def stringToLong(s: String): Long = s.toLong
}

object StringToNumberOps extends StringToNumberOps

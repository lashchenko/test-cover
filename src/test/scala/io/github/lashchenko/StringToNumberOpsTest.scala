package io.github.lashchenko

import org.scalatest.{Matchers, WordSpec}

class StringToNumberOpsTest extends WordSpec with Matchers {

  "StringToNumberOps" should {

    "String to Int" in {
      StringToNumberOps.stringToInt("123") shouldBe 123
    }

    "String to Long" in {
      StringToNumberOps.stringToLong("123") shouldBe 123L
    }

  }

}

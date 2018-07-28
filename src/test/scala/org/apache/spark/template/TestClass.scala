package org.apache.spark.template

import org.scalatest.{FlatSpec, Matchers}

class TestClass extends FlatSpec with Matchers {

  "An empty Set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }

}

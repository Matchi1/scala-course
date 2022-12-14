package com.td.mylist

import collection.mutable.Stack
import org.scalatest._
import flatspec._
import matchers.should.Matchers

class Test extends AnyFlatSpec with Matchers {

  "Empty MyList" should "exists" in {
    MyList.initEmpty()
  }

  it should "be empty" in {
    MyList.initEmpty().isEmpty()
  }

  it should "have a length of 0" in {
    MyList.initEmpty().length shouldBe (0)

  }

  it should "have no head element" in {
    MyList.initEmpty().firstElement shouldBe None
  }

  it should "have a no tail elements" in {
    MyList.initEmpty().remainingElements shouldBe MyList.initEmpty()
  }

  it should "empty string display correctly" in {
    MyList.initEmpty().toPrint shouldBe ""
  }

  it should "map nothing" in {
    MyList.initEmpty().map(_ => ()) shouldBe MyList.initEmpty()
  }

  it should "initiate a list" in {
    MyList.initEmpty().addElement(3).length shouldBe 1
  }

  "MyList" should "exists" in {
    MyList.init()
  }

  it should "initialize with 0 elements" in {
    MyList.init().isEmpty()
    MyList.init() shouldBe End
    MyList.init() shouldBe MyList.initEmpty()
  }

  it should "initialize with 1 element" in {
    MyList.init(3).length shouldBe 1
    MyList.init(3) shouldBe Element(3, End)
  }

  it should "initialize with multiple elements" in {
    MyList.init(3, 4).length shouldBe 2
    MyList.init(3, 4) shouldBe Element(3, Element(4, End))
  }

  it should "have head element" in {
    MyList.init(3).firstElement shouldBe Some(3)
    MyList.init(3, 4).firstElement shouldBe Some(3)
  }

  it should "have a tail elements" in {
    MyList.init(3).remainingElements shouldBe End
    MyList.init(3, 4).remainingElements shouldBe Element(4, End)
  }

  it should "empty string display correctly" in {
    MyList.init(3).toPrint shouldBe "3"
    MyList.init(3, 4).toPrint shouldBe "3, 4"
  }

  it should "map nothing" in {
    val f: Int => Int = _ * 2
    MyList.init(3).map(f) shouldBe MyList.init(f(3))
    MyList.init(3, 4).map(f) shouldBe MyList.init(f(3), f(4))
  }

  it should "add an element" in {
    MyList.init(3).addElement(5) shouldBe (MyList.init(5, 3))
    MyList.init(3, 4).addElement(5) shouldBe MyList.init(5, 3, 4)
  }

  it should "have apply" in {
    MyList(3) shouldBe MyList.init(3)
    MyList() shouldBe End
  }
}

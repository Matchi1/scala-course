package com.td.mylist

object Main extends App {
  
  // TODO implement MyList and make the tests pass

  // Examples

  val list1: MyList[Int] = Element(1, End)
  val list2: MyList[Int] = Element(1, End)
  val list3              = MyList.init(1, 2, 3)
  val list4              = MyList.init(1, 2, 3, 5).map(_ * 2)

  println(list1 == list2)
  println(End == End)
  println(list1 == list2)
  println(list3.toPrint)
  println(list4.toPrint)
}

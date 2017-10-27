object NBDcw1z9 {
  def main(args: Array[String]): Unit = {
    val someList = List(21,54,24,64,2,5,4,8,66,45,5,3,55,75,7,6,8,6564,54,54)
    println(addOneToEvery(someList))
  }

  def addOneToEvery(list: List[Int]) = list.map{ _ + 1 }
}

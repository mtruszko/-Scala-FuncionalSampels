object NBDcw1z8 {
  def main(args: Array[String]): Unit = {
    val listWithZeros = List(1,2,4,5,7,8,43,432,655,76,2,0,0,54,0,343,0,0,0,0,454)
    println(removeZeros(listWithZeros))
  }

  def removeZeros(from: List[Int]) = from.filterNot(_ == 0)
}

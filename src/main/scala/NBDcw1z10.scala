object NBDcw1z10 {
  def main(args: Array[String]): Unit = {
    val list = List(123,134,435,46,5,-5,-6,-4,-1,32,-43,-12)
    println(funABSToSome(list))
  }

  def funABSToSome(list: List[Int]) = list.map ( a => if (a >= -5 && a <= 12) a.abs else a )
}

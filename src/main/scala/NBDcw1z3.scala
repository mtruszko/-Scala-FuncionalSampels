object NBDcw1z3 {
  def main(args: Array[String]): Unit = {
    someFun((3, true, "aaa"))
  }

  def someFun(x: (Int, Boolean, String)) =
    println(s"Int: ${x._1}, Boolean: ${x._2}, String: ${x._3}.")
}

object NBDcw1z4 {
  def main(args: Array[String]): Unit = {
    val someMap = Map("a" -> "b")
    println("Not existing: " + someMap.get("c"))
    println("Else: " + someMap.get("c").getOrElse("?"))
  }
}

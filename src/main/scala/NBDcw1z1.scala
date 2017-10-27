object NBDcw1z1 {
  def main(args: Array[String]) {
    printByFor(days)
    printElementsStartsWithPByFor(days)
    printByForEach(days)
    printByWhile(days)
    printByRecurent(days)
    printInverseByRecurent(days)
    printByFoldl(days)
    printByFoldr(days)
    printElementsStareWithPByFoldl(days)
  }

  val days = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def printElementsStareWithPByFoldl(list: List[String]) =
    println("\n\n1.h\n" + list.foldLeft("")((acc, el) => if (el.startsWith("P")) acc + el + "\n" else acc))

  def printByFoldr(list: List[String]) =
    println("\n\n1.g2" + list.foldRight("")((a, b) => "\n" + a + b))

  def printByFoldl(list: List[String]) {
    println("\n\n1.g1")
    println(list.foldLeft("")((b, a) => b + a + "\n"))
  }

  def printInverseByRecurent(list: List[String]) {
    println("\n\n1.f")
    var copyList = list
    recurentPrint(copyList)

    def recurentPrint(list: List[String]) {
      if (list.isEmpty) {
        return
      }
      recurentPrint(list.tail)
      println(list.head)
    }
  }

  def printByRecurent(list: List[String]) {
    println("\n\n1.e")
    var copyList = list
    recurentPrint(copyList)

    def recurentPrint(list: List[String]) {
      if (list.isEmpty) {
        return
      }
      println(list.head)
      recurentPrint(list.tail)
    }
  }

  def printByWhile(list: List[String]) {
    println("\n\n1.d")
    var i = 0
    while (i < list.length) {
      println(list(i))
      i += 1
    }
  }

  def printByForEach(list: List[String]) {
    println("\n\n1.c")
    list.foreach {
      println
    }
  }

  def printElementsStartsWithPByFor(list: List[String]) {
    println("\n\n1.b")
    for (a <- list if a.startsWith("P")) {
      println(a)
    }
  }

  def printByFor(list: List[String]) {
    println("1.a")
    for (i <- list) yield println(i)
  }
}

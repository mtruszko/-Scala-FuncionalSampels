object NBDcw1z5 {
  def main(args: Array[String]): Unit = {
    println(days.map{fun(_)})
    println(fun(""))
  }

  val days = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def fun(someString: String) = someString match {
    case x if List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek").contains(x) => "Praca"
    case "Sobota" => "Weekend"
    case "Niedziela" => "Weekend"
    case _ => "Nie ma takiego dnia"
  }
}

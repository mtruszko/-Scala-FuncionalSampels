object NBDcw1z7 {
  def main(args: Array[String]): Unit = {
    val ab = Osoba("a", "b")
    val cd = Osoba("c", "d")
    val ef = Osoba("e", "f")
    println(powitaj(ab))
    println(powitaj(cd))
    println(powitaj(ef))
  }

  case class Osoba(val imie: String, val nazwiako: String) { }

  def powitaj(osoba: Osoba) = osoba match {
    case Osoba("a", "b") => "Hej, ab!"
    case Osoba("c", "d") => "Hej, cd!"
    case _ => "Hej, Ty!"
  }
}

object NBDcw1z6 {
  def main(args: Array[String]): Unit = {
    val konto = new KontoBankowe(stanKonta = 250)
    konto.wyplata(100)
    konto.wplata(200)
    konto.wyplata(500)
    println(konto.stanKonta)

    val konto2 = new KontoBankowe()
    konto2.wplata(0)
  }
}

class KontoBankowe(val stanKonta: Int) {
  def this() = this(0)

  def wplata(kwota: Int) =  kwota
  def wyplata(kwota: Int) = if (!(kwota > stanKonta)) kwota else 0
}

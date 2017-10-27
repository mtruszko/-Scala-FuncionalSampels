object NBDcw1z2 {
  def main(args: Array[String]): Unit = {
    println(productLowPrice)
  }

  val productPrice = Map("Prod1" -> 3.0, "Prod2" -> 444.0)

  def productLowPrice() = productPrice.map { case (s, d) => (s, d * 0.9) }
}

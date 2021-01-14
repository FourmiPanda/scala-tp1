package money

object Currency extends Enumeration {
  type Currency = Value

  val Euro = Value("EUR")
  val Dollar = Value("USD")
  val Yen = Value("JPY")

  val locale = Euro

  implicit def double2Locale(d: Double): Account = Account(d, locale);


  val exchangeRate: Map[Currency.Value,Map[Currency.Value, Double]] = Map(
    Euro -> Map(Euro -> 1.0, Dollar -> 1.15850, Yen -> 131.676),
    Dollar -> Map(Euro -> 0.863187, Dollar -> 1.0, Yen -> 113.648),
    Yen -> Map(Euro -> 0.00759441, Dollar -> 0.00879910	, Yen -> 1.0)
  )

  def main(args: Array[String])
  {
    System.out.println(exchangeRate(Euro)(Dollar))
    System.out.println(exchangeRate(Euro)(Euro))
    System.out.println(exchangeRate(Yen)(Dollar))
  }

}
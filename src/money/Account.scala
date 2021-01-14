package money

import Currency._

class Account(var n: Double, var d: Currency) {

  override def toString = n + " " + d

  def +(that: Account) = new Account(that.n + (n * Currency.exchangeRate(d)(that.d)), that.d)

}

object Account {
  def apply(n: Double, d: Currency) = new Account(n, d)

  var a1 = Account(10.55, Currency.Euro)
  var a2 = Account(1000, Currency.Yen) + a1
  def main(args: Array[String]) = {
    System.out.println(a1)
    System.out.println(a2)
  }
}

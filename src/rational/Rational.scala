package rational

class Rational(var n: Int, var d: Int) {
  def this(n: Int) {
    this(n, 1)
  }

  //def getN = n

  //public void setN(int i) { n = i; }
  //def getD = d

  //public void setD(int i) { d = i; }
  override def toString = n + "/" + d

  def +(that: Rational) = new Rational(n * that.d + that.n * d, d * that.d)

  def *(that: Rational) = new Rational(n * that.n, d * that.d)

}

object Rational {
  def apply(n: Int, d: Int) = new Rational(n, d)

  def main(args: Array[String]) = {
    val r1 = Rational(1,2)
    var r2 = new Rational(1,2)
    System.out.println(r1)
    System.out.println(r2)
  }
}
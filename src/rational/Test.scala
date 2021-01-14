package rational

object Test {
  val r1 = new Rational(1) + new Rational(1, 2)
  val r2 = new Rational(1, 2) * new Rational(1, 2)

  def main(args: Array[String]) = {
    System.out.println(r1)
    System.out.println(r2)
    //r1.setD(0);
    //System.out.println(r1)
  }
}
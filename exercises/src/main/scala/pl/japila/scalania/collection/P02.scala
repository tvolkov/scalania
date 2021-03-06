package pl.japila.scalania.collection

object P02 {
  def checkNegatives[T](m: Map[T, Seq[Int]]): Map[T, Boolean] = {
    m map {case (k, v) => (k, v.forall(x => x < 0))}
  }
}

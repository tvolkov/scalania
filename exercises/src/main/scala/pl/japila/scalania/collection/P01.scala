package pl.japila.scalania.collection

object P01 {
  def filterNot[T](ts: Seq[T], p: T => Boolean): Seq[T] = {
    for (t <- ts if !p(t)) yield t
  }

}

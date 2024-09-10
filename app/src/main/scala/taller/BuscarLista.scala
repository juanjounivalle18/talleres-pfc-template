package taller

class BuscarLista() {
  def buscarElemento(lista: List[Int], elemento: Int): Boolean = {
    lista match {
      case Nil => false
      case x :: xs => if (x == elemento) true else buscarElemento(xs, elemento)
    }
  }

  def sumOfSquares(n: Int, acc: Int = 0): Int = {
    if (n == 0) acc
    else sumOfSquares(n - 1, acc + n * n)
  }

  // Currificar la función
  def customSum(n: Int, increment: Int)(operation: (Int, Int) => Int, acc: Int = 0): Int = {
    if (n <= 0) acc
    else customSum(n - increment, increment)(operation, operation(acc, n * n))
  }

  // Ejemplo de uso
  val resultado = customSum(5, 1)(_ + _)
  println(resultado) // Debería imprimir 55
}
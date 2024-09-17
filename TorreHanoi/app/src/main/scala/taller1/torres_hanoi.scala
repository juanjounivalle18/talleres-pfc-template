package taller
object torres_hanoi{

  // Función que calcula el número mínimo de movimientos
  def movsTorresHanoi(n: Int): BigInt = {
    if (n == 0) 0
    else BigInt(2).pow(n) - 1
  }

  // Función que devuelve la lista de movimientos
  def torresHanoi(n: Int, t1: Int, t2: Int, t3: Int): List[(Int, Int)] = {
    // Si no hay discos, no hay movimientos
    if (n == 0) List()
    else {
      // Movemos n-1 discos de t1 a t2 usando t3 como intermediaria
      val movimientos1 = torresHanoi(n - 1, t1, t3, t2)

      // Movemos el disco restante de t1 a t3
      val movimientoDisco = (t1, t3)

      // Movemos n-1 discos de t2 a t3 usando t1 como intermediaria
      val movimientos2 = torresHanoi(n - 1, t2, t1, t3)

      // Combinamos todos los movimientos
      movimientos1 ++ List(movimientoDisco) ++ movimientos2
    }
  }
}


/*
// Ejemplo de uso
def main(args: Array[String]): Unit = {
val n = 3
println(s"El número mínimo de movimientos para $n discos es: ${movsTorresHanoi(n)}")
println("Lista de movimientos:")
torresHanoi(n, 1, 2, 3).foreach { case (a, b) => println(s"Mover disco de la torre $a a la torre $b") }
}
}
*/
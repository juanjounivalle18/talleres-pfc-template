// MaximoLista.scala
package taller1

import scala.annotation.tailrec

/**
 * Clase que contiene las funciones para calcular el máximo en una lista de enteros.
 */
class MaximoLista {

  /**
   * Función que utiliza recursión lineal para encontrar el máximo en una lista de enteros.
   * @param l Lista de enteros no vacía.
   * @return El máximo valor de la lista.
   */
  def maxLin(l: List[Int]): Int = {
    l match {
      case Nil => throw new NoSuchElementException("Lista vacía")
      case head :: Nil => head
      case head :: tail => math.max(head, maxLin(tail))
    }
  }

  /**
   * Función que utiliza recursión de cola para encontrar el máximo en una lista de enteros.
   * @param l Lista de enteros no vacía.
   * @return El máximo valor de la lista.
   */
  def maxIt(l: List[Int]): Int = {
    @tailrec
    def maxItAux(l: List[Int], max: Int): Int = {
      l match {
        case Nil => max
        case head :: tail => maxItAux(tail, math.max(max, head))
      }
    }
    
    l match {
      case Nil => throw new NoSuchElementException("Lista vacía")
      case head :: tail => maxItAux(tail, head)
    }
  }
}
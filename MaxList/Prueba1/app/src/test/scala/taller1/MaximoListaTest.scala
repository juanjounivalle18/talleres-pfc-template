// MaximoListaTest.scala
import org.scalatest.funsuite.AnyFunSuite
import taller1.MaximoLista

class MaximoListaTest extends AnyFunSuite {

  val maximo = new MaximoLista

  // Casos de prueba para maxLin
  test("maxLin debe devolver el valor máximo en una lista de enteros positivos") {
    assert(maximo.maxLin(List(3, 5, 2, 8, 1)) == 8)
  }

  test("maxLin debe lanzar NoSuchElementException para una lista vacía") {
    assertThrows[NoSuchElementException] {
      maximo.maxLin(List())
    }
  }

  test("maxLin debe devolver el valor del único elemento para una lista con un solo elemento") {
    assert(maximo.maxLin(List(7)) == 7)
  }

  test("maxLin debe manejar una lista con enteros negativos y positivos") {
    assert(maximo.maxLin(List(-3, 5, -2, 8, 1)) == 8)
  }

  test("maxLin debe manejar una lista donde todos los elementos son iguales") {
    assert(maximo.maxLin(List(4, 4, 4, 4)) == 4)
  }

  // Casos de prueba para maxIt
  test("maxIt debe devolver el valor máximo en una lista de enteros positivos") {
    assert(maximo.maxIt(List(3, 5, 2, 8, 1)) == 8)
  }

  test("maxIt debe lanzar NoSuchElementException para una lista vacía") {
    assertThrows[NoSuchElementException] {
      maximo.maxIt(List())
    }
  }

  test("maxIt debe devolver el valor del único elemento para una lista con un solo elemento") {
    assert(maximo.maxIt(List(7)) == 7)
  }

  test("maxIt debe manejar una lista con enteros negativos y positivos") {
    assert(maximo.maxIt(List(-3, 5, -2, 8, 1)) == 8)
  }

  test("maxIt debe manejar una lista donde todos los elementos son iguales") {
    assert(maximo.maxIt(List(4, 4, 4, 4)) == 4)
  }
}
package taller.test_hanoi

package taller1

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class hanoi_Test1 extends AnyFunSuite {
  test("El número mínimo de movimientos para 1 disco debe ser 1") {
    assert(taller.torres_hanoi.movsTorresHanoi(1) == 1)
  }

  test("El número mínimo de movimientos para 4 discos debe ser 15") {
    assert(taller.torres_hanoi.movsTorresHanoi(4) == 15)
  }

  test("La secuencia de movimientos para 2 discos debe ser correcta") {
    val movimientosEsperados = List((1, 2), (1, 3), (2, 3))
    assert(taller.torres_hanoi.torresHanoi(2, 1, 2, 3) == movimientosEsperados)
  }

  test("La secuencia de movimientos para 3 discos debe ser correcta") {
    val movimientosEsperados = List(
      (1, 3), (1, 2), (3, 2),
      (1, 3), (2, 1), (2, 3), (1, 3)
    )
    assert(taller.torres_hanoi.torresHanoi(3, 1, 2, 3) == movimientosEsperados)
  }

  test("Para 0 discos no debe haber movimientos") {
    assert(taller.torres_hanoi.torresHanoi(0, 1, 2, 3) == List())
  }
}

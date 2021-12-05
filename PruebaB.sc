/*implementar el método de Newton-Raphson,
* para calcular la raíz cuadrada de un número entero positivo mayor que cero*/

//Función cuadrática x^2 - n
def f(x:Double, n:Int): Double = Math.pow(x,2) - n

// Derivada de la función cuadrática, 2x
def dx(x: Double): Double = 2 * x

def raiz_cuadrada2(n: Int): Double = {
  var x = 1.0 // valor inicial
  (1 to 25).foreach(i => x = x - f(x, n) / dx(x))
  x // Retornamos la raíz cuadrada
}
raiz_cuadrada2(10)
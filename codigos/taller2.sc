// EJERCICIO 1

// Método 1
def calcularAreaTriangulo(base: Double, altura: Double): Double =
  (base * altura) / 2

// Método 2
def celsiusAFahrenheit(celsius: Double): Double =
  val fahrenheit = celsius * 9 / 5 + 32
  Math.round(fahrenheit * 100.0) / 100.0

// Método 3
def calcularVolumenCilindro(radio: Double, altura: Double): Double =
  Math.PI * Math.pow(radio, 2) * altura

// Método 4
def calcularInteresCompuesto(capital: Double, tasa: Double, periodos: Int): Double =
  capital * Math.pow(1 + tasa, periodos)

// ---------------------------------------------------------
// FUNCIONES MATEMÁTICAS COMO CÓDIGO
// ---------------------------------------------------------

// Función 1: suma de 2i, de 1 a n
def f1(n: Int) = (1 to n).map(i => 2 * i).sum

// Función 2: suma de 1 / (i * (i + 1)), de 1 a n
def f2(n: Int): Double =
  (1 to n).map(i => 1.0 / (i * (i + 1))).sum

// Función 3: productoria de (2i - 1), de 1 a n
def f3(n: Int): BigInt =
  (1 to n).map(i => BigInt(2 * i - 1)).product

// Función 4: (suma de i al cuadrado) / (productoria de i), de 1 a n
def f4(n: Int): Double =
  (1 to n).map(i => i * i).sum.toDouble / (1 to n).map(BigInt(_)).product.toDouble

// Función 5: suma de a * r^i, de 1 a n
def f5(n: Int, a: Double, r: Double): Double =
  (1 to n).map(i => a * Math.pow(r, i)).sum

// ---------------------------------------------------------
// PRUEBAS
// ---------------------------------------------------------

println(calcularAreaTriangulo(10, 5))
println(celsiusAFahrenheit(100))
println(calcularVolumenCilindro(2, 3))
println(calcularInteresCompuesto(1000, 0.05, 2))

println(f1(3))
println(f2(3))
println(f3(4))
println(f4(3))
println(f5(3, 2, 3))

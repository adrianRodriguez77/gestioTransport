// Clase Autobus
abstract class Autobus(val numeroIdentificacion: String, val conductor: Conductor, val precioBase: Double) {
    abstract fun altaAutobus()
    abstract fun calcularPrecio(): Double
}

abstract class Autobus(val numIdentificacio: String, val conductor: Conductor, val preuBase: Double) {
    abstract fun altaAutobus()
    abstract fun calcularPreu(): Double
}
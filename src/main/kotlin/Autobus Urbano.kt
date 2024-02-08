// Clase AutobusUrbano
class AutobusUrbano(numeroIdentificacion: String, conductor: Conductor, precioBase: Double, val ruta: String) :
    Autobus(numeroIdentificacion, conductor, precioBase) {

    override fun altaAutobus() {
        println("Autobús urbano dado de alta: $numeroIdentificacion")
    }

    override fun calcularPrecio(): Double {
        return if (ruta == "A") {
            precioBase + (0.1 * precioBase)
        } else {
            precioBase + (0.2 * precioBase)
        }
    }
}
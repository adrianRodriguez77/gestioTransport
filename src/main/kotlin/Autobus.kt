// Autobus.kt
abstract class Autobus(val numeroIdentificacion: String, val conductor: Conductor, val precioBase: Double)

class AutobusUrbano(numeroIdentificacion: String, conductor: Conductor, precioBase: Double, val ruta: String) :
    Autobus(numeroIdentificacion, conductor, precioBase) {
    fun calcularPrecio(): Double {
        return if (ruta == "A") {
            precioBase + (0.1 * precioBase)
        } else {
            precioBase + (0.2 * precioBase)
        }
    }
}

class AutobusInterurbano(numeroIdentificacion: String, conductor: Conductor, precioBase: Double, val kilometros: Int) :
    Autobus(numeroIdentificacion, conductor, precioBase) {
    fun calcularPrecio(): Double {
        return precioBase * kilometros
    }
}

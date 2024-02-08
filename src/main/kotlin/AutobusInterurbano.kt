// Clase AutobusInterurbano
class AutobusInterurbano(numeroIdentificacion: String, conductor: Conductor, precioBase: Double, val kilometros: Int) :
    Autobus(numeroIdentificacion, conductor, precioBase) {

    override fun altaAutobus() {
        println("Autobús interurbano dado de alta: $numeroIdentificacion")
    }

    override fun calcularPrecio(): Double {
        return precioBase * kilometros
    }
}
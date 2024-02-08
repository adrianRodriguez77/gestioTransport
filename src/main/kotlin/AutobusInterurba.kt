// Clase AutobusInterurbano
class AutobusInterurba(numeroIdentificacion: String, conductor: Conductor, precioBase: Double, val kilometros: Int) :
    Autobus(numeroIdentificacion, conductor, precioBase) {

    override fun altaAutobus() {
        println("Autobús interurbano dado de alta: $numIdentificacio")
    }

    override fun calcularPreu(): Double {
        return preuBase * kilometros
    }
}
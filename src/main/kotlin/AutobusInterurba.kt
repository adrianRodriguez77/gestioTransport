// Clase AutobusInterurbano
class AutobusInterurba(numeroIdentificacion: String, conductor: Conductor, precioBase: Double, val quilometres: Int) :
    Autobus(numeroIdentificacion, conductor, precioBase) {

    override fun altaAutobus() {
        println("Autobús interurbà $numIdentificacio donat d'alta.")
    }

    override fun calcularPreu(): Double {
        return preuBase * quilometres
    }
}
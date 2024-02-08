
class AutobusUrba(numIdentificacio: String, conductor: Conductor, preuBase: Double, val ruta: String) :
    Autobus(numIdentificacio, conductor, preuBase) {

    override fun altaAutobus() {
        println("Autobús urbà $numIdentificacio donat d'alta.")
    }

    override fun calcularPreu(): Double {
        return if (ruta == "A") {
            preuBase + (0.1 * preuBase)
        } else {
            preuBase + (0.2 * preuBase)
        }
    }
}

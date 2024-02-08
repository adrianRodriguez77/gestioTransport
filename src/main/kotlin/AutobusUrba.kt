
class AutobusUrba(numIdentificacio: String, conductor: Conductor, preuBase: Double, val ruta: String) :
    Autobus(numIdentificacio, conductor, preuBase) {

    override fun altaAutobus() {
        println("Autobús urbano dado de alta: $numIdentificacio")
    }

    override fun calcularPreu(): Double {
        return if (ruta == "A") {
            preuBase + (0.1 * preuBase)
        } else {
            preuBase + (0.2 * preuBase)
        }
    }
}

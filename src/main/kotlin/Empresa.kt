
class EmpresaTransport {
    val conductors = mutableListOf<Conductor>()
    val autobusos = mutableListOf<Autobus>()

    fun altaConductor(nom: String, salari: Double): List<Conductor> {
        val conductor = Conductor(nom, salari)
        conductors.add(conductor)
        conductor.altaConductor()
        return conductors
    }

    fun altaAutobusUrba(numIdentificacio: String, numIdConductorUrba: String, preuBase: Double, ruta: String) {
        val conductorUrba = trobarConductor(numIdConductorUrba)
        if (conductorUrba != null) {
            val autobus = AutobusUrba(numIdentificacio, conductorUrba, preuBase, ruta)
            autobusos.add(autobus)
            autobus.altaAutobus()
        } else {
            println("Conductor no trobat.")
        }
    }

    fun altaAutobusInterurba(numIdentificacio: String, numIdConductorInterurbano: String, precioBase: Double, kilometros: Int) {
        val conductorInterurba = trobarConductor(numIdConductorInterurbano)
        if (conductorInterurba != null) {
            val autobus = AutobusInterurba(numIdentificacio, conductorInterurba, precioBase, kilometros)
            autobusos.add(autobus)
            autobus.altaAutobus()
        } else {
            println("Conductor no trobat.")
        }
    }

    private fun trobarConductor(numIdConductor: String): Conductor? {
        for (conductor in conductors) {
            if (conductor.nom == numIdConductor) {
                return conductor
            }
        }
        return null
    }

    fun comprarBitllet(numId: String) {
        val autobus = trobarAutobus(numId)
        if (autobus != null) {
            val precio = autobus.calcularPreu()
            println("Número de identificación: ${autobus.numIdentificacio}")
            println("Nombre del conductor: ${autobus.conductor.nom}")
            println("Precio del billete: $precio")
        } else {
            println("No se encontró un autobús con el número de identificación proporcionado.")
        }
    }

    private fun trobarAutobus(numId: String): Autobus? {
        for (autobus in autobusos) {
            if (autobus.numIdentificacio == numId) {
                return autobus
            }
        }
        return null
    }

    fun llistarAutobuses() {
        println("Llista d'Autobusos:")
        for (autobus in autobusos) {
            println(autobus.numIdentificacio)
        }
    }

    fun llistarConductores() {
        println("Llista de Conductors:")
        for (conductor in conductors) {
            println(conductor.nom)
        }
    }
}
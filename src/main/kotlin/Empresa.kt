// Clase EmpresaTransporte
class EmpresaTransporte {
    val conductores = mutableListOf<Conductor>()
    val autobuses = mutableListOf<Autobus>()

    fun altaConductor(): List<Conductor> {
        print("Nombre del conductor: ")
        val nombreConductor = readLine() ?: ""
        print("Salario del conductor: ")
        val salarioConductor = readLine()?.toDoubleOrNull() ?: 0.0

        val conductor = Conductor(nombreConductor, salarioConductor)
        conductores.add(conductor)
        conductor.altaConductor()
        return conductores
    }

    fun altaAutobusUrbano(numeroIdentificacion: String, numIdConductorUrbano: String, precioBase: Double, ruta: String) {
        val conductorUrbano = buscarConductor(numIdConductorUrbano)
        if (conductorUrbano != null) {
            val autobus = AutobusUrbano(numeroIdentificacion, conductorUrbano, precioBase, ruta)
            autobuses.add(autobus)
            autobus.altaAutobus()
        } else {
            println("No se encontró un conductor con el nombre proporcionado.")
        }
    }

    fun altaAutobusInterurbano(numeroIdentificacion: String, numIdConductorInterurbano: String, precioBase: Double, kilometros: Int) {
        val conductorInterurbano = buscarConductor(numIdConductorInterurbano)
        if (conductorInterurbano != null) {
            val autobus = AutobusInterurbano(numeroIdentificacion, conductorInterurbano, precioBase, kilometros)
            autobuses.add(autobus)
            autobus.altaAutobus()
        } else {
            println("No se encontró un conductor con el nombre proporcionado.")
        }
    }

    private fun buscarConductor(numIdConductor: String): Conductor? {
        for (conductor in conductores) {
            if (conductor.nombre == numIdConductor) {
                return conductor
            }
        }
        return null
    }

    fun comprarBillete(numId: String) {
        val autobus = buscarAutobus(numId)
        if (autobus != null) {
            val precio = autobus.calcularPrecio()
            println("Número de identificación: ${autobus.numeroIdentificacion}")
            println("Nombre del conductor: ${autobus.conductor.nombre}")
            println("Precio del billete: $precio")
        } else {
            println("No se encontró un autobús con el número de identificación proporcionado.")
        }
    }

    private fun buscarAutobus(numId: String): Autobus? {
        for (autobus in autobuses) {
            if (autobus.numeroIdentificacion == numId) {
                return autobus
            }
        }
        return null
    }

    fun listarAutobuses() {
        println("Lista de Autobuses:")
        for (autobus in autobuses) {
            println("- Número de identificación: ${autobus.numeroIdentificacion}")
        }
    }

    fun listarConductores() {
        println("Lista de Conductores:")
        for (conductor in conductores) {
            println("- Nombre: ${conductor.nombre}")
        }
    }
}
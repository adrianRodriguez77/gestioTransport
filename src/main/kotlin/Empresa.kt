// EmpresaTransporte.kt
class EmpresaTransporte {
    val conductores = mutableListOf<Conductor>()
    val autobuses = mutableListOf<Autobus>()

    fun altaConductor(nombre: String, salario: Double) {
        val conductor = Conductor(nombre, salario)
        conductores.add(conductor)
        println("Conductor dado de alta: $nombre")
    }

    fun altaAutobusUrbano(numeroIdentificacion: String, conductor: Conductor, precioBase: Double, ruta: String) {
        val autobus = AutobusUrbano(numeroIdentificacion, conductor, precioBase, ruta)
        autobuses.add(autobus)
        println("Autobús urbano dado de alta: $numeroIdentificacion")
    }

    fun altaAutobusInterurbano(numeroIdentificacion: String, conductor: Conductor, precioBase: Double, kilometros: Int) {
        val autobus = AutobusInterurbano(numeroIdentificacion, conductor, precioBase, kilometros)
        autobuses.add(autobus)
        println("Autobús interurbano dado de alta: $numeroIdentificacion")
    }

    fun comprarBillete(numeroIdentificacion: String) {
        val autobus = autobuses.find { it.numeroIdentificacion == numeroIdentificacion }
        if (autobus != null) {
            val precio = if (autobus is AutobusUrbano) {
                autobus.calcularPrecio()
            } else {
                (autobus as AutobusInterurbano).calcularPrecio()
            }
            println("Número de identificación: ${autobus.numeroIdentificacion}")
            println("Nombre del conductor: ${autobus.conductor.nombre}")
            println("Precio del billete: $precio")
        } else {
            println("No se encontró un autobús con el número de identificación proporcionado.")
        }
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

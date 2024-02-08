import java.util.Scanner

val scanner = Scanner(System.`in`)
fun main() {
    val empresaTransporte = EmpresaTransporte()

    // Menú principal
    do {
        println("""
            MENÚ PRINCIPAL
            1. Alta de conductores
            2. Alta de autobuses urbanos
            3. Alta de autobuses interurbanos
            4. Comprar billete
            5. Listar autobuses
            6. Listar conductores
            
            Selecciona una opció: 
        """.trimMargin())
        val opcMenu = scanner.nextInt()

        when (opcMenu) {
            1 -> {
                print("Nombre del conductor: ")
                val nombreConductor = scanner.next()
                print("Salario del conductor: ")
                val salarioConductor = scanner.nextDouble()
                empresaTransporte.altaConductor(nombreConductor, salarioConductor)
            }
            2 -> {
                print("Número de identificación del autobús urbano: ")
                val numIdAutobusUrbano = scanner.next()
                print("Número de identificación del conductor: ")
                val numIdConductorUrbano = scanner.next()
                val conductorUrbano = empresaTransporte.conductores.find { it.nombre == numIdConductorUrbano }
                if (conductorUrbano != null) {
                    print("Precio base del autobús urbano: ")
                    val precioBaseUrbano = scanner.nextDouble()
                    print("Ruta del autobús urbano (A o cualquier otra): ")
                    val rutaUrbano = scanner.next()
                    empresaTransporte.altaAutobusUrbano(numIdAutobusUrbano, conductorUrbano, precioBaseUrbano, rutaUrbano)
                } else {
                    println("No se encontró un conductor con el nombre proporcionado.")
                }
            }
            3 -> {
                print("Número de identificación del autobús interurbano: ")
                val numIdAutobusInterurbano = readLine() ?: ""
                print("Número de identificación del conductor: ")
                val numIdConductorInterurbano = readLine() ?: ""
                val conductorInterurbano = empresaTransporte.conductores.find { it.nombre == numIdConductorInterurbano }
                if (conductorInterurbano != null) {
                    print("Precio base del autobús interurbano: ")
                    val precioBaseInterurbano = readLine()?.toDoubleOrNull() ?: 0.0
                    print("Número de kilómetros del autobús interurbano: ")
                    val kilometrosInterurbano = readLine()?.toIntOrNull() ?: 0
                    empresaTransporte.altaAutobusInterurbano(numIdAutobusInterurbano, conductorInterurbano, precioBaseInterurbano, kilometrosInterurbano)
                } else {
                    println("No se encontró un conductor con el nombre proporcionado.")
                }
            }
            4 -> {
                print("Número de identificación del autobús: ")
                val numIdAutobus = readLine() ?: ""
                empresaTransporte.comprarBillete(numIdAutobus)
            }
            5 -> {
                empresaTransporte.listarAutobuses()
            }
            6 -> {
                empresaTransporte.listarConductores()
            }
            0 -> {
                println("Saliendo del programa...")
            }
            else -> {
                println("Opción no válida. Inténtalo de nuevo.")
            }
        }
    } while (opcMenu != 0)
}

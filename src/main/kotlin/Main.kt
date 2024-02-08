fun main() {
    val empresaTransporte = EmpresaTransporte()

    var opcion: Int
    do {
        println("\n--- Menú Principal ---")
        println("1. Alta de conductores")
        println("2. Alta de autobuses urbanos")
        println("3. Alta de autobuses interurbanos")
        println("4. Comprar billete")
        println("5. Listar autobuses")
        println("6. Listar conductores")
        println("0. Salir")
        print("Selecciona una opción: ")
        opcion = readLine()?.toIntOrNull() ?: -1

        when (opcion) {
            1 -> {

            }
            2 -> {
                print("Número de identificación del autobús urbano: ")
                val numIdAutobusUrbano = readLine() ?: ""
                print("Número de identificación del conductor: ")
                val numIdConductorUrbano = readLine() ?: ""
                print("Precio base del autobús urbano: ")
                val precioBaseUrbano = readLine()?.toDoubleOrNull() ?: 0.0
                print("Ruta del autobús urbano (A o cualquier otra): ")
                val rutaUrbano = readLine() ?: ""
                empresaTransporte.altaAutobusUrbano(numIdAutobusUrbano, numIdConductorUrbano, precioBaseUrbano, rutaUrbano)
            }
            3 -> {
                print("Número de identificación del autobús interurbano: ")
                val numIdAutobusInterurbano = readLine() ?: ""
                print("Número de identificación del conductor: ")
                val numIdConductorInterurbano = readLine() ?: ""
                print("Precio base del autobús interurbano: ")
                val precioBaseInterurbano = readLine()?.toDoubleOrNull() ?: 0.0
                print("Número de kilómetros del autobús interurbano: ")
                val kilometrosInterurbano = readLine()?.toIntOrNull() ?: 0
                empresaTransporte.altaAutobusInterurbano(numIdAutobusInterurbano, numIdConductorInterurbano, precioBaseInterurbano, kilometrosInterurbano)
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
    } while (opcion != 0)
}
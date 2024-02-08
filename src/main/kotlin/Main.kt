import java.util.Scanner

val scanner = Scanner(System.`in`)
fun main() {
    val empresaTransporte = EmpresaTransport()
    do {
        print("""
            MENÚ PRINCIPAL
            1. Alta de conductores
            2. Alta de autobuses urbanos 
            3. Alta de autobuses interurbanos
            4. Comprar billete
            5. Llistat autobuses
            6. Llistat conductores
            7. Sortir
            
            Selecciona una opción: 
        """.trimMargin())
        val opcion = scanner.nextInt()
            when (opcion) {
            1 -> {
                print("Nom del conductor: ")
                val nombreConductor = scanner.next()
                print("Salari del conductor: ")
                val salarioConductor = scanner.nextDouble()
                empresaTransporte.altaConductor(nombreConductor, salarioConductor)
            }
            2 -> {
                print("Número de identificació de l'autobús urbÀ: ")
                val numIdAutobusUrbano = scanner.next()
                print("Nom del conductor: ")
                val numIdConductorUrbano = scanner.next()
                print("Preu base de l'autobús urbà: ")
                val precioBaseUrbano = scanner.nextDouble()
                print("Ruta del autobús urbà (A/altre): ")
                val rutaUrbano = scanner.next()
                empresaTransporte.altaAutobusUrba(numIdAutobusUrbano, numIdConductorUrbano, precioBaseUrbano, rutaUrbano)
            }
            3 -> {
                print("Número de identificació de l'autobús interurbà: ")
                val numIdAutobusInterurbano = scanner.next()
                print("Nom del conductor: ")
                val numIdConductorInterurbano = scanner.next()
                print("Preu base de l'autobús interurbà: ")
                val precioBaseInterurbano = scanner.nextDouble()
                print("Número de quilómetres de l'autobús interurbà: ")
                val kilometrosInterurbano = scanner.nextInt()
                empresaTransporte.altaAutobusInterurba(numIdAutobusInterurbano, numIdConductorInterurbano, precioBaseInterurbano, kilometrosInterurbano)
            }
            4 -> {
                print("Número de identificació de l'autobús: ")
                val numIdAutobus = scanner.next()
                empresaTransporte.comprarBitllet(numIdAutobus)
            }
            5 -> {
                empresaTransporte.llistarAutobuses()
            }
            6 -> {
                empresaTransporte.llistarConductores()
            }
            7 -> {
                println("Sortint...")
            }
            else -> {
                println("Opció no vàlida.")
            }
        }
    } while (opcion != 7)
}
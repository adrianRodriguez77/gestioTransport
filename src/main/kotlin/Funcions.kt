/*
import java.util.Scanner

val scanner = Scanner(System.`in`)
fun menuPrincipal(){
    do {
        println("""
        MENÚ PRINCIPAL
        1. Alta de conductors
        2. Alta d'autobusos
        3. Comprar bitllet per un autobús.
        4. Llistar autobusos
        5. Llistar conductors
        
        Selecciona una opció:
    """.trimMargin())
        val opcMenu = scanner.nextInt()
        when(opcMenu){
            1-> {
                print("Nom del conductor: ")
                val nomConductor = scanner.next()
                print("Salario del conductor: ")
                val salariConductor = scanner.nextDouble()
                empresa.altaConductor(nomConductor, salariConductor)
            }
            2-> {
                val listaConductores = empresa.conductores
                println("Número d'identificació: ")
                val nIdBus = scanner.next()
                println("Conductor:")
                var nomConductor = scanner.next()
                var conductorInLlista = false
                for (nomConductor in listaConductores){
                    conductorInLlista = true
                }
                if (!conductorInLlista){
                    println("Aquest conductor existeix.")
                } else {
                    println("Aquest conductor no està creat. Torna a introduir altre nom.")
                    nomConductor = scanner.next()
                }
                do {
                    println("Tipus de autobus (Urbà/Interurbà):")
                    var tipusBus = scanner.next()
                    when(tipusBus){
                        "Urbà", "Interurbà"-> println("Tipus de bus correcte.")
                        else -> {
                            println("Torna a introduir-lo")
                            tipusBus = scanner.next()
                        }
                    }
                }while (tipusBus != "Urbà" && tipusBus != "Interurbà")
                val precioBase = 50.0
                empresa.altaAutobus(nIdBus, nomConductor, precioBase, ruta, tipusBus)

            }
            3-> println("En proceso")
            4-> println("En proceso")
            5-> println("En proceso")
            6-> println("En proceso")
        }
    }while (opcMenu != 0)

}*/

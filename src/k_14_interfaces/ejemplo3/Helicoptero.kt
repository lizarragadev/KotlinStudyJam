package k_14_interfaces.ejemplo3

/**
 * @author Gustavo Lizárraga
 * @date 26/09/2019
 *
 * Implementamos la función volar con un comportamiento distinto
 * para un Helicoptero.
 *
 * */

class Helicoptero(var cantidadPasajeros: Int): ComportamientoInterface {
    override fun volar() {
        println("Comportamiento de mi Helicoptero con $cantidadPasajeros pasajeros")
    }

}

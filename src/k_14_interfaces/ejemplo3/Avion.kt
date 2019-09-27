package k_14_interfaces.ejemplo3

/**
 * @author Gustavo Lizárraga
 * @date 26/09/2019
 *
 * Implementamos la función volar con un comportamiento distinto
 * para un Avion.
 *
 * */

class Avion(var empresa: String) : ComportamientoInterface {
    override fun volar() {
        println("Este es el comportamiento de mi avion: $empresa")
    }

}
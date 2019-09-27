package k_13_herencia.ejemplo3

/**
 * @author Gustavo Lizárraga
 * @date 26/09/2019
 *
 * Clase donde se hereda la clase Dado
 *
 * */

class DadoRecuadro: Dado() {
    override fun imprimir() {
        println("***")
        println("*$valor*")
        println("***")
    }
}

package k_14_interfaces.ejemplo1

/**
 * @author Gustavo Lizárraga
 * @date 26/09/2019
 *
 * Para poder realizar la implementación de una interface debemos
 * colocar similar a la herencia el operador :
 * Al colocar la llamada a la interface nos dará error en la clase y nos
 * pedirá que implementemos las funciones de la interface.
 *
 * */

class PuntoPlano (val x: Int, val y: Int) : Punto {

    override fun imprimir() {
        println("Punto en el plano: ($x, $y)")
    }

}
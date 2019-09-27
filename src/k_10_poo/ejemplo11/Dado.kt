package k_10_poo.ejemplo11

/**
 * @author Gustavo Lizárraga
 * @date 26/09/2019
 *
 * Ejercicio de manejo de modificadores de acceso privado.
 *
 * */

class Dado{
    private var valor: Int = 1
    fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt()
    }

    fun imprimir() {
        separador()
        println("Valor del dado: $valor")
        separador()
    }

    private fun separador() = println("**************************************")
}
package k_01_tiposDeDatoYEntradaPorTeclado

/**
 * @author Gustavo Lizárraga
 * @date 26/09/2019
 *
 * Ejemplo para hallar el perímetro de un cuadrado.
 *
 * */

fun main() {
    print("Ingrese longitud de un lado: ")
    println("El perimetro es: ${readLine()!!.toInt().times(4)}")
}
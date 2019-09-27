package k_13_herencia.ejemplo2

/**
 * @author Gustavo Lizárraga
 * @date 26/09/2019
 *
 * Asignamos el operador : para decir que heredaremos de una clase
 * y lo llamamos junto con su constructor.
 *
 * */

class CalculadoraCientifica(valor1: Double, valor2: Double): Calculadora(valor1, valor2) {
    fun cuadrado() {
        resultado = valor1 * valor1
    }

    fun raiz() {
        resultado = Math.sqrt(valor1)
    }
}
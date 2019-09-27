package k_14_interfaces.ejemplo2

/**
 * @author Gustavo Lizárraga
 * @date 26/09/2019
 *
 * Declaramos 2 funciones e implementamos una con la misma funcionalidad
 * para cualquier objeto que quiera hacer uso de esta interface.
 *
 * */

interface Figura {
    fun calcularSuperficie(): Int
    fun calcularPerimetro(): Int
    fun tituloResultado() {
        println("Datos de la figura")
    }
}
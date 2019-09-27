package k_10_poo.ejemplo3

/**
 * @author Gustavo Lizárraga
 * @date 26/09/2019
 *
 * Como se puede ver acá, solamente creamos el objeto de esa forma.
 *
 * */

fun main() {
    val alumno1 = Alumno()
    alumno1.inicializar()
    alumno1.imprimir()
    alumno1.mostrarEstado()
    val alumno2 = Alumno()
    alumno2.inicializar()
    alumno2.imprimir()
    alumno2.mostrarEstado()
}
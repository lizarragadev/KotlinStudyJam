package k_10_poo.ejemplo8

/**
 * @author Gustavo Lizárraga
 * @date 26/09/2019
 *
 * Como vemos, el objeto posee 2 tipos de forma de creación de instancia.
 *
 * */

fun main() {
    val t1 = Triangulo()
    t1.ladoMayor()

    val t2 = Triangulo(4, 6, 4)
    t2.ladoMayor()
}
package k_12_enum_classes.ejemplo3

/**
 * @author Gustavo Lizárraga
 * @date 26/09/2019
 *
 * Con el nombre que se asignó al ENUM podemos acceder a determinado
 * valor, directamente sin necesidad de hacer alguna acción extra.
 *
 * */

fun main() {
    val pais1 = Paises.BRASIL
    println(pais1)
    println(pais1.habitantes)
}
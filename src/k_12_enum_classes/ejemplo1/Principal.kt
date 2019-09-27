package k_12_enum_classes.ejemplo1

/**
 * @author Gustavo Lizárraga
 * @date 26/09/2019
 *
 * Para poder acceder al valor estático de un ENUM solamente
 * llamamos al enum y el valor que queramos obtener.
 *
 * */

fun main() {
    val carta1 = Carta(TipoCarta.ESPADA, 3)
    carta1.imprimir()

    val carta2 = Carta(TipoCarta.TREBOL, 9)
    carta2.imprimir()
}
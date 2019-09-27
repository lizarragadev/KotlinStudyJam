package k_12_enum_classes.ejemplo2

/**
 * @author Gustavo Lizárraga
 * @date 26/09/2019
 *
 * Ejercicio con ENUMS
 *
 * */

fun main() {
    val operacion1 = Operacion(10, 4, TipoOperacion.SUMA)
    operacion1.operar()
}

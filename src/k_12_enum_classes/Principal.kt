package k_12_enum_classes

import k_12_enum_classes.ejemplo1.Carta
import k_12_enum_classes.ejemplo1.TipoCarta
import k_12_enum_classes.ejemplo2.Operacion
import k_12_enum_classes.ejemplo2.TipoOperacion

fun main() {
    val carta1 = Carta(TipoCarta.CORAZON, 4)
    val carta2 = Carta(TipoCarta.DIAMANTE, 3)
    val carta3 = Carta(TipoCarta.TREBOL, 2)
    carta1.imprimir()
    carta2.imprimir()
    carta3.imprimir()

    val enum1 = TipoCarta.PICA
    println(enum1)
    println(enum1.name)
    println(enum1.ordinal)

    val operacion1 = Operacion(10, 4, TipoOperacion.SUMA)
    operacion1.operar()
}

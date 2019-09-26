package k_15_manejo_de_nulos

fun main() {
    //Si queremos que una variable acepte nulos debemos colocar el operador ? al tipo de dato:
    var nombre: String?
    nombre = null

    // A partir de que le colocamos el operador ? empiezan los problemas porque Kotlin no nos dejará compilar
    // nuestro código a no ser que validemos que realmente no sea nulo determinada variable. (En timpo de compilación).
    val x: Int? = null
    if (x != null) {
        val y = x.toDouble()
    }

    // Expresion de acceso seguro
    val y = x?.toDouble()
    print(y)

    // Pero si no queremos tener una variable Nullable utilizamos el operador ELVIS ?:
    val y1 = x?.toDouble() ?: 0.0
    // Seria equivalente a escribir:
    // val y = if (x != null) {
    //    x.toDouble()
    //} else {
    //    0.0
    //}

    // Evitando el chequeo de null   !! ( mala práctica )
    val x2: Int? = null
    val y2 = x2!!.toDouble()

}
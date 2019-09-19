package k_09_arrayYColecciones

// Crear un mapa que permita almacenar 5 artículos, utilizar como clave el nombre de productos y como valor el precio del mismo.
//Desarrollar además las funciones de:
//1) Imprimir en forma completa el diccionario
//2) Mostrar la cantidad de artículos con precio superior a 20.

fun imprimir(productos: Map<String, Float>) {
    for((clave, valor) in productos)
        println("$clave tiene un precio $valor")
    println();
}

fun cantidadPrecioMayor20(productos: Map<String, Float>) {
    val cant = productos.count{ it.value > 20}
    println("Cantidad de productos con un precio superior a 20: $cant")
}

fun main() {
    val productos: Map<String, Float> = mapOf("papas" to 12.5f,
        "manzanas" to 26f,
        "peras" to 31f,
        "mandarinas" to 15f,
        "pomelos" to 28f)
    imprimir(productos)
    cantidadPrecioMayor20(productos)
}
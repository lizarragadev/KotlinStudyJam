package k_09_arrayYColecciones

fun main() {
    val paises: Map<String, Int> = mapOf( Pair("argentina", 40000000),
        Pair("españa", 46000000),
        Pair("uruguay", 3400000))
    println("Listado completo del Map")
    println(paises)
    for ((clave, valor) in paises)
        println("Para la clave $clave tenemos almacenado $valor")
    println("La cantidad de elementos del mapa es ${paises.size}")
    val cantHabitantes1: Int? = paises["argentina"]
    if (cantHabitantes1 != null)
        println("La cantidad de habitantes de argentina es $cantHabitantes1")
    val cantHabitantes2: Int? = paises["brasil"]
    if (cantHabitantes2 != null)
        println("La cantidad de habitantes de brasil es $cantHabitantes2")
    else
        println("brasil no se encuentra cargado en el Map")
    var suma = 0
    paises.forEach { suma += it.value }
    println("Cantidad total de habitantes de todos los paises es $suma")
}
package k_09_arrayYColecciones

fun main() {
    var lista1: List<Int> = List(5) {cargarLista()}
    println(lista1)
}

fun cargarLista(): Int {
    print("Ingrese un entero: ")
    return readLine()!!.toInt()
}

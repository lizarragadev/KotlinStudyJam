package k_03_rangos

fun main() {
    val rangoCarac = 'a'..'z'
    val letraABuscar = 'B'

    if(letraABuscar in rangoCarac) {
        print("La letra $letraABuscar SI está en el rango de $rangoCarac")
    } else {
        print("La letra $letraABuscar NO está en el rango de $rangoCarac")
    }
}
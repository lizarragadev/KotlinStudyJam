package k_04_estructuraWhen

fun main() {
    print("Ingrese un número: ")
    val dato1 = readLine()!!.toInt()
    when(dato1) {
        1 -> print("Uno")
        2 -> print("Dos")
        3 -> print("Tres")
        4 -> print("Cuatro")
        5 -> print("Cinco")
        6 -> print("Seis")
        7 -> print("Siete")
        8 -> print("Ocho")
        9 -> print("Nueve")
        0 -> print("Cero")
        else -> print("No valido")
    }
}
package k_04_estructuraWhen

fun main() {
    print("Ingrese coordenada x del punto: ")
    val x = readLine()!!.toInt()
    print("Ingrese coordenada y del punto: ")
    val y = readLine()!!.toInt()
    when {
        x > 0 && y > 0 -> println("El punto se encuentra en el primer cuadrante")
        x < 0 && y > 0 -> println("El punto se encuentra en el segundo cuadrante")
        x < 0 && y < 0 -> println("El punto se encuentra en el tercer cuadrante")
        x > 0 && y < 0 -> println("El punto se encuentra en el cuarto cuadrante")
        else -> println("El punto se encuentra en un eje")
    }
}
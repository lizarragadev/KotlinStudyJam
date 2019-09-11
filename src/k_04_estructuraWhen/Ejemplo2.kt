package k_04_estructuraWhen

fun main() {
    print("Ingrese nota 1: ")
    val n1 = readLine()!!.toInt()
    print("Ingrese nota 2: ")
    val n2 = readLine()!!.toInt()
    print("Ingrese nota 3: ")
    val n3 = readLine()!!.toInt()
    val promedio = (n1.plus(n2).plus(n3)).div(3).toDouble()
    when {
        promedio >= 7 -> println("El promedio es $promedio [BUENO]")
        promedio <= 4 -> println("El promedio es $promedio [DEFICIENTE]")
        else -> println("El promedio es $promedio [REGULAR]")
    }
}
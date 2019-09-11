package k_02_estructuraIF

fun main() {
    print("Ingrese el sueldo del empleado: ")
    val sueldo = readLine()!!.toDouble()
    if (sueldo > 3000)
        println("Debe pagar impuestos")
    else
        println("No debe pagar impuestos")
}
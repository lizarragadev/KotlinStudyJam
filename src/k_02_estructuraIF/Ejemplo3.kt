package k_02_estructuraIF

/**
 * @author Gustavo Lizárraga
 * @date 26/09/2019
 *
 * Ejercicio trabajando con IF ELSE y lectura de datos de teclado.
 *
 * */

fun main() {
    print("Ingrese el sueldo del empleado: ")
    val sueldo = readLine()!!.toDouble()
    if (sueldo > 3000)
        println("Debe pagar impuestos")
    else
        println("No debe pagar impuestos")
}
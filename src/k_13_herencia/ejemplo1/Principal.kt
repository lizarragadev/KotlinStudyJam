package k_13_herencia.ejemplo1

fun main() {
    val persona1 = Persona("Gustavo", 28)
    println("Datos de la persona")
    persona1.imprimir()

    val empleado1 = Empleado("Cecilia", 39, 5000.0)
    println("Datos del empleado")
    empleado1.imprimir()
    empleado1.pagaImpuestos()
}
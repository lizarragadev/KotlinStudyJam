package k_10_poo.ejemplo1

fun main() {

    val persona1: Persona = Persona()
    persona1.inicializar("Juan", 12)
    persona1.imprimir()
    persona1.esMayorEdad()

    val persona2: Persona = Persona()
    persona2.inicializar("Ana", 50)
    persona2.imprimir()
    persona2.esMayorEdad()

}
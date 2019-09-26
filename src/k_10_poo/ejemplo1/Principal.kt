package k_10_poo.ejemplo1

fun main() {
    val persona1 = Persona()
    persona1.inicializar("Gustavo", 28)
    persona1.imprimir()
    persona1.esMayorDeEdad()

    val persona2 = Persona()
    persona2.inicializar("Valeria", 12)
    persona2.imprimir()
    persona2.esMayorDeEdad()
}
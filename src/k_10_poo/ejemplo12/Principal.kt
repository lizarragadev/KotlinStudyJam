package k_10_poo.ejemplo12

fun main() {
    val persona1 = Persona()
    persona1.nombre = "juan"
    persona1.edad = 23
    println(persona1.nombre)
    println(persona1.edad)
    persona1.edad = -50
    println(persona1.edad)
}
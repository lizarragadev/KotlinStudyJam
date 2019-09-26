package k_10_poo.ejemplo6

class Persona(var nombre: String, var edad: Int) {
    init {
        if(edad < 0)
            edad = 0
    }

    fun imprimePersona() {
        println("Nombre: $nombre - Edad: $edad")
    }
}
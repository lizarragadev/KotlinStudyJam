package k_10_poo.ejemplo1

class Persona {
    var nombre = ""
    var edad = 0

    fun inicializar(n: String, e: Int) {
        this.nombre = n
        this.edad = e
    }

    fun imprimir() {
        println("Nombre: $nombre - Edad: $edad")
    }

    fun esMayorDeEdad() {
        if(edad >= 18)
            println("Es mayor de edad.")
        else
            println("No es mayor de edad.")
    }
}

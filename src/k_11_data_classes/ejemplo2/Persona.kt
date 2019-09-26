package k_11_data_classes.ejemplo2

data class Persona(var nombre: String, var edad: Int) {
    override fun toString(): String {
        return "$nombre, $edad"
    }
}
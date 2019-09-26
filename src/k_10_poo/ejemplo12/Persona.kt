package k_10_poo.ejemplo12

class Persona {
    var nombre: String = ""
        set(valor) {
            field = valor.toUpperCase()
        }
        get() {
            return "($field)"
        }

    var edad: Int = 0
        set(valor) {
            field = if (valor >= 0)
                valor
            else
                0
        }
}
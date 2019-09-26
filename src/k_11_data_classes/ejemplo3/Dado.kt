package k_11_data_classes.ejemplo3

data class Dado (var valor: Int) {
    override fun toString(): String {
        var cadena = ""
        for(i in 1..valor)
            cadena = "$cadena*"
        return cadena
    }
}
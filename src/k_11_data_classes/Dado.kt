package k_11_data_classes

data class Dado(var valor: Int) {
    override fun toString(): String {
        var concatena = ""
        for (i in 1..valor)
            concatena+= "* "
        return concatena
    }
}
package k_11_data_classes.ejemplo3

/**
 * @author Gustavo Lizárraga
 * @date 26/09/2019
 *
 * Lo que si podemos sobrecargar es las funciones predefinidas que tiene
 * un Data Class como la función toString() la cuál se llama automáticamente
 * cuando imprimimos un objeto.
 *
 * */

data class Dado (var valor: Int) {
    override fun toString(): String {
        var cadena = ""
        for(i in 1..valor)
            cadena = "$cadena*"
        return cadena
    }
}
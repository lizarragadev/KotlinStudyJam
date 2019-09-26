package k_06_estructuraWhileDoWhile

/**
 * @author Gustavo Lizárraga
 * @date 26/09/2019
 *
 * Ejemplo de creación y uso de la estructura cíclica DO WHILE
 *
 * */

fun main() {
    do {
        print("Ingrese un valor comprendido entre 0 y 999: ")
        val valor = readLine()!!.toInt()
        if (valor < 10)
            println("El valor ingresado tiene un dígito")
        else
            if (valor < 100)
                println("El valor ingresado tiene dos dígitos")
            else
                println("El valor ingresado tiene más de tres dígitos")
    } while (valor != 0)
}
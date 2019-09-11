package k_06_estructuraWhileDoWhile

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
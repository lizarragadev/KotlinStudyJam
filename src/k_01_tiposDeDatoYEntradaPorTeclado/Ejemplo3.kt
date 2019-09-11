package k_01_tiposDeDatoYEntradaPorTeclado

fun main() {
    print("Ingrese numero 1: ")
    val v1 = readLine()!!.toInt()
    print("Ingrese numero 2: ")
    val v2 = readLine()!!.toInt()
    println("La suma es: ${v1.plus(v2)}")
    println("La resta es: ${v1.minus(v2)}")
    println("La multiplicacion es: ${v1.times(v2)}")
    println("La division es: ${v1.div(v2)}")
}

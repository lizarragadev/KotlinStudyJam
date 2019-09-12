package k_07_funcionesYProcedimientos

fun main() {
    print("Ingrese el valor de un lado de un cuadrado: ")
    val la = readLine()!!.toInt()
    val superficie = retSuperficie(la)
    println("La superficie del cuadrado es: $superficie")
}

fun retSuperficie(l: Int) = l.times(l)

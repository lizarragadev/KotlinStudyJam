package k_07_funcionesYProcedimientos

fun main() {
    print("Ingrese el valor de un lado de un cuadrado: ")
    val la = readLine()!!.toInt()
    val superficie = retornarSuperficie(la)
    println("La superficie del cuadrado es: $superficie")
}

fun retornarSuperficie(l: Int) : Int {
    return l.times(l)
}
package k_02_estructuraIF

fun main() {
    print("Ingrese un valor: ")
    val da = readLine()!!.toInt()
    //IF Inline
    val resultado = if(da % 2 == 0) {
        print("Cuadrado ")
        da * da
    } else {
        print("Cubo ")
        da * da * da
    }
    println(resultado)
}
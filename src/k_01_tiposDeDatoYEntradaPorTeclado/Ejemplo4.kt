package k_01_tiposDeDatoYEntradaPorTeclado

fun main() {
    // HALLAR EL PERIMETRO DE UN CUADRADO
    print("Ingrese longitud de un lado: ")
    println("El perimetro es: ${readLine()!!.toInt().times(4)}")
}
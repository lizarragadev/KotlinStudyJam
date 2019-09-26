package k_10_poo.ejemplo2

fun main() {
    val triangulo1 = Triangulo()
    //Pedir datos de teclado
    triangulo1.inicializar()
    //Imprimir el lado mayor del triangulo
    triangulo1.ladoMayor()
    // Verificar si el triangulo es equilatero
    triangulo1.esEquilatero()
}
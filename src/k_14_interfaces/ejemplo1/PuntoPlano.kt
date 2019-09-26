package k_14_interfaces.ejemplo1

class PuntoPlano(val x: Int, val y: Int): Punto {
    override fun imprimir() {
        println("Punto en el plano: ($x,$y)")
    }
}
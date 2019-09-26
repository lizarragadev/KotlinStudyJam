package k_14_interfaces.ejemplo1

class PuntoEspacio(val x: Int, val y: Int, val z: Int): Punto {
    override fun imprimir() {
        println("Punto en el espacio: ($x,$y,$z)")
    }
}
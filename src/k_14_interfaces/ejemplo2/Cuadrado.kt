package k_14_interfaces.ejemplo2

class Cuadrado(val lado: Int): Figura {
    override fun calcularSuperficie(): Int {
        return lado * lado
    }

    override fun calcularPerimetro(): Int{
        return lado * 4
    }
}

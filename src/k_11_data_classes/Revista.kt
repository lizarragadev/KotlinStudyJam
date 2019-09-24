package k_11_data_classes

data class Revista(var codigo: Int, var titulo: String, var precio: Float) {
    override fun toString(): String {
        return "$codigo - $titulo - $precio"
    }
}
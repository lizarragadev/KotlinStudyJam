package k_08_funLocalesExpresLambda

fun main() {
    val suma = { n1: Int, n2: Int -> n1 + n2 }
    print("${suma(2, 4)}")
}
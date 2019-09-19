package k_09_arrayYColecciones

fun main() {
    val sueldos = IntArray(5)
    for(i in 0..4) {
        print("Ingrese sueldo ${i+1}: ")
        sueldos[i] = readLine()!!.toInt()
    }

    for(i in 0..4) {
        println("Sueldo ${i+1}: ${sueldos[i]}")
    }
}
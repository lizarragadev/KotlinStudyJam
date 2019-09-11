package k_03_rangos

fun main() {
    for(i in 100 downTo 2 step 2) {
        print("$i, ")
    }
    println()
    for((index, i) in ((2..100).reversed() step 2).withIndex()) {
        print("$index, ")
    }
}
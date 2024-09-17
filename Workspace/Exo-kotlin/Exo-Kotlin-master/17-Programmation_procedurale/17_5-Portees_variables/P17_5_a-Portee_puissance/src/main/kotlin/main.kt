fun pow(thirteen:Int): Int {

    fun main() {
        var thirteen = 13
        for (i in 2..10) {
            thirteen *= pow(13 * 1)
            println(thirteen)
        }
    }
} // POUR LA PUISSANCE
fun main() {
    print("saisir un nombre : ")
    val n = readln().toInt()
    println("Entrez la valeur $n nombres :")
    var minValue = Int.MAX_VALUE
    for (i in 1..n){
        val num = readln() !!.toInt()
        if (num <= minValue){
            minValue = num
        }
    }
    println("La valeur minimal est : $minValue")
}

fun main() {
    val n = readln()!!.toInt()
    val numbers = mutableListOf<Int>()
    repeat(n) {
        numbers.add(readln()!!.toInt())
    }
    var tripleCOunt = 0
    for (i in 0 until n-2){
        if ( numbers[i] +1 == numbers[i+1] && numbers[i+1] + 1 == numbers[i+2]){
            tripleCOunt++
        }
    }
    println(tripleCOunt)
}


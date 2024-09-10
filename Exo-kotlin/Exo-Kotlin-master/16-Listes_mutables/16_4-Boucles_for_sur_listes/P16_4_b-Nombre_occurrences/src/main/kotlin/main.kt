fun main() {
    val n = readln()!!.toInt()
    val numbers = List(n) { readln()!!.toInt() }

    val m = readln()!!.toInt()
    val count = numbers.count{it == m}
    print(count)
}

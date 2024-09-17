// write your function here
fun isVowel( char: Char):Boolean{
    val vowels = listOf('a','e','i','o','u','A','E','I','O','U')
    return char in vowels
}
fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}

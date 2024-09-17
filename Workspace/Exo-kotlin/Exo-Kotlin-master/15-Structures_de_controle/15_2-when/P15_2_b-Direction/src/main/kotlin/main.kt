fun main() {
    print(" number :")
    val n = readln().toInt()
    println("Vous avez saisi : $n")
    if (n == 1){
        print("move up")
    }
    else if (n == 2){
        print("move down")
    }
    else if (n == 3){
        print("move left")
    }
    else if (n == 4){
        print("right")
    }
    else if (n == 0){
        print("do not move")
    }
    else {
        print("erreur")
    }
}

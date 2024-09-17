fun main() {
    print("House :")
    val n = readln().toString()
    println("Vous avez saisi : $n")
    if (n == "Gryffindor"){
        println("bravery")
    }
    else if (n == "Hufflepuff"){
        println("loyalty")
    }
    else if (n == "SLytherin"){
        println("cunning")
    }
    else if (n == "Ravenclaw"){
        println("intellect")
    }
    else {
        print("not a valid house")
    }
}

fun main() {
    var mot = "ninho"
    var result =""
    for(i in 'a'..'z') {
        if (i in mot) {
            continue
        }
        result+=i
    }
    print(result)
}

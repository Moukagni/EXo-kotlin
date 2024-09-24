class Kitty {
    var color:String
    var age:Int

    constructor(){
        this.color="Unknown"
        this.age=0
    }
    constructor(color:String,age:Int){

    }
}


fun main() {
    val garfield = Kitty("orange", 7)
    val tom = Kitty(8, "grey")
    val grominet = Kitty("black")
    val kitty = Kitty(3)
}
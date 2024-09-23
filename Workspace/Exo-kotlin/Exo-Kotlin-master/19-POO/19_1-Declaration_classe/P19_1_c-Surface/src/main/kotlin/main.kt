class Rectangle {
    var width: Int = 0
    var height: Int = 0
}

fun printArea(rectangle: Rectangle) {
    val area = rectangle.width * rectangle.height
    println("The area of the rectangle is : $area")
}

fun main() {
    val rectlangle = Rectangle()
    rectlangle.width = 5
    rectlangle.height = 3
    printArea(rectlangle)
}
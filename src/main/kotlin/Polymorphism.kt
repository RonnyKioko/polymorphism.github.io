//Parent class
open class Shape{
    open fun draw(){
        println("It is a shape")
    }
}
//Child class
class Rectangle:Shape(){
    override fun draw(){
        println("Rectangle")
    }
}
class Square:Shape(){
    override fun draw() {
        println("Square")
    }
}
fun main(){
    var r=Rectangle()
    r.draw()

    var s=Square()
    s.draw()

    var shape=Shape()
    shape.draw()
}
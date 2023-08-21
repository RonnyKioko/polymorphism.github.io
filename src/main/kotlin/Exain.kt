open class shape{
    fun area(){
        println(44)
    }
    fun circumference(){
        println(14)
    }
}
class rectangle:shape(){
    var length=7
    var breadth=20
    fun getlength(){
        println(length)
    }
    fun getbreadth(){
        println(breadth)
    }
}
class Circle:shape(){
    var radius=14
    fun getradius(){
        println(radius)
    }
}
fun main(){
    var r=rectangle()
    r.area()
    var c=Circle()
    c.circumference()
}


open class Employee{
    fun salary(){
        println( 25000)
    }
    fun name(){
        println("Ronny")
    }
    fun age(){
        println(25)
    }
}
class WebDeveloper:Employee(){
    fun website(){
        println("Ecommerce")
    }
}
class AndroidDeveloper:Employee(){
    fun android(){
        println("My First App")
    }
}
class iOSDeveloper:Employee(){
    fun iOS(){
        println("Just Print")
    }
}
fun main(){
    var w=WebDeveloper()
    w.salary()
    var a=AndroidDeveloper()
    a.salary()
    var i=iOSDeveloper()
    i.name()

}
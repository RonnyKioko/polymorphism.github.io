//Parent class/Super class/Base class
open class Animal1{
    var colour="Brown"
    fun eat(){
        println("Animal is eating")
    }
}
//Child class/Sub class/Derived class


open class Dog1:Animal1(){
    var name="Siberian Husky"
    fun sound(){
        println("Dog is barking")
    }
}
class Cat:Dog1(){
    var hasFur=true
    fun meow(){
        println("Meowing")
    }
}
fun main(){
    var a=Animal1()
    println(a.colour)
    a.eat()

    var d=Dog1()
    d.eat()
}
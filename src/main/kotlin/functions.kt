fun main(){
    //Standard Library Functions/Predefined functions
    println("Hello Kotlin")
    var squareroot=Math .sqrt(81.0)
    println(squareroot)
    var number=Math.round(34.26)
    println(number)
    var num=Math.ceil(45.2)
    println(num)
    sum()
    product()
}
//User-defined Function
fun sum(){
    var num1=3
    var num2=4
    println(num2+num1)
}
fun product(){
    var num3=2
    var num4=6
    println(num3*num4)
}
//Parameterized functions
fun product(x:Int, y:Int){
    println(x*y)
}
fun divide(first:Int,second:Int){
    println(first/second)
}
 fun details(name:String,age:Int){
     println("My name is $name.I am $age years old")
 }
fun main(){
    var language= arrayOf("Kotlin","Java","PHP")
    //Accessing an element
        println(language[0])

    language[1]="Python"
    for (x in language){
        println(x)
    }
    //Size of the array
    println(language.size)
    //Adding an element to an array
    var new=language.plus("C++")
    for (b in new){
        print(b)
    }

}
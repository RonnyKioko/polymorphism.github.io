fun main(){
    for (number in 1..10){
        println(number)
    }
    for(letter in 's'..'z'){
        println(letter)
    }
    //break
    for (myletter in 'a'..'d'){
        if (myletter=='c'){
            break
        }
        //Continue
        for (num in 20..30){
            if (num==25){
                continue
            }
            println(num)
        }
    }
}
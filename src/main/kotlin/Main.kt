package ru.netology


fun main() {

    abc(1)
}
fun abc (likes: Int){
    val likesRemainder = likes % 10
    if (likes===11){
        println("Понравилось $likes людям")
    }
    else if (likesRemainder===1){
        println("Понравилось " + likes + " человеку")
    }
    else{
        ("Понравилось $likes людям")
    }
}
package ru.netology


fun main() {

    numberOfLikesFor(11)
}
fun numberOfLikesFor (likes: Int){
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
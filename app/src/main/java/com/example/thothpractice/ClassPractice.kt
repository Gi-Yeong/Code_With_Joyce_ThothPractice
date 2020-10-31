package com.example.thothpractice


open class Human constructor(val name: String = "Anonymous") {

    constructor(name: String, age: Int) : this(name) {
        println("My name is ${name}, ${age} years old")
    }

    init {
        println("New Human has been born!!!")
    }

    fun eatingCake() {
        println("This is so YUMMYYY~~~~")
    }

    open fun singASong() {
        println("lalala")
    }
}

class Korean: Human() {

    override fun singASong() {
        super.singASong()
        println("라라라")
        println("my name is :${name}")
    }

}


fun main() {

    /*var human = Human("Thoth")
    var stranger = Human()
    human.eatingCake()*/

//    val mom = Human("Kuri", 60)

//    println("This Human's name is ${stranger.name}")

    val korean = Korean()
    korean.singASong()

}
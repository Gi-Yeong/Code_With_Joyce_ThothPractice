package com.example.thothpractice

fun main() {

    // 3. String Template

    val name = "thoth"
    val lastName = "Kim"
    println("my name is ${name + lastName} I'm 36")

    println("is this true? ${1==0}")
    println("this is 2\$")

}

// 1. 함수

fun helloWorld() {
    println("Hello World")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

// 2. val vs var
// val = value
// var = variable

fun hi() {
    val a : Int = 10
    var b : Int = 9

    var e : String

    b = 100

    val c = 100
    var d = 100

    var name = "thoth"
}
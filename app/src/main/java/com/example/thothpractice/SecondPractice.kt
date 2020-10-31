package com.example.thothpractice

// 1. Lamda
// 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다.
// 1) 메소드에 파라미터로 넘겨줄 수 있다.
// 2) return 값으로 사용할 수가 있다.

// 람다의 기본 정의
// val lamdaName: Type = {argumentList -> codeBody}

//          input -> output    input -> output
val square: (Int) -> (Int) = { number -> number * number }

val nameAge = { name: String, age: Int ->
    "my name is ${name} I'm ${age}"
}

fun main() {

    println(square(12))
    println(nameAge("Thoth", 99))

}
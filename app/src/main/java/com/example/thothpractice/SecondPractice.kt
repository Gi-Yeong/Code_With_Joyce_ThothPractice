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

    val a = "Thoth said"
    val b = "mac said"

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("Thoth", 28))

    val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6)
    val filtered = numbers.getHigherThan(3)
    println(filtered)

    println(calculateGrade(97))

    val lamda = {number: Double ->
        number == 4.3213
    }

    println(invokeLamda(lamda))
    println(invokeLamda { it > 3.22 })



}

// 확장함수
// 확장 함수는 fun 클래스이름.함수이름(인자타입): 리턴타입 { 구현부 }으로 정의

val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name: String, age: Int) : String {

    val introduceMyself : String.(Int) -> String = { "I am ${this} and ${it} years old" }
    return name.introduceMyself(age)
}

fun List<Int>.getHigherThan(num: Int): List<Int> {
    val result = arrayListOf<Int>()
    for (item in this) {
        if (item > num) {
            result.add(item)
        }
    }
    return result
}

// 람다의 Return
val calculateGrade: (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

// 람다를 표현하는 여러가지 방법

fun invokeLamda(lamda: (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}
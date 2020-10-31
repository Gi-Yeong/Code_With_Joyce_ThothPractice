package com.example.thothpractice

fun main() {

    checkNum(1)

}

// 4. 조건문

fun maxBy(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

// Expression
fun maxBy2(a: Int, b: Int) = if (a > b) a else b

fun checkNum(score: Int) {
    // Statement
    when (score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }
    
    // 이때에는 else 를 꼭 써야 한다
    // Expression
    var b = when(score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b : ${b}")

    when(score) {
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

// Expression vs Statement
// 1. 무언가 뽀짝뽀짝 해서 값을 만들면 Expression
// 2. 그게 아니면 Statement
// 기본적으로 코틀린의 함수는 다 Expression 이다. 리턴 값이 없어 보여도 Unit 을 리턴 하기 때문에

// 5. Array and List

// Array -> 크기가 할당 되어 나옴
// List 1. List 2. MutableList

fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3
    var result = list.get(0)

    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)


}
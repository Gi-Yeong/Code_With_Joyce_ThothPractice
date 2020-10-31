package com.example.thothpractice

fun main() {

    forAndWhile()
    nullCheck()

    ignoreNulls("email")
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
    var b = when (score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b : ${b}")

    when (score) {
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

// 6. For / While

fun forAndWhile() {

    val student = arrayListOf("joyce", "james", "jenny", "jennifer")

    for (name in student) {
        println("${name}")
    }

    for ((index, name) in student.withIndex()) {
        println("${index + 1} 번째 학색: ${name}")
    }

    var sum: Int = 0
//    for (i in 1..10 step 2) {
//    for (i in 10 downTo 1) {
    for (i in 1 until 100) { // 1부터 99 까지
        sum += i
    }
    println(sum)

    var index = 0
    while (index < 10) {
        println("current index: ${index}")
        index++
    }
}

// 7. Nullable / NonNull
fun nullCheck() {
    // NPE : Null Pointer Exception

    var name: String = "Thoth"

    var nullName: String? = null

    var nameInUpperCase = name.toUpperCase()

    var nullNameInUpperCase = nullName?.toUpperCase()

    // ?: -> Null 이면 Default 값을 지정해서 리턴 해 줄 수 있다
    val lastName: String? = null
    val fullName = name + " " + (lastName ?: "No lastName")
    println(fullName)


}

// !! -> null 이 아닌걸 보증해 줄께, 정말로 확실 하지 않는 이상 쓰지 말자
fun ignoreNulls(str: String?) {
    val mNotNull: String = str!!
    val upper = mNotNull.toUpperCase()

    val email: String? = null
//    val email: String? = "kiyoung85@gmail.com"
    email?.let {
        println("my email is $it")
    }
}
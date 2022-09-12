package com.example.kotlinrevesion


class Testing {

    fun addTwoNumber(a: Int, b: Int, myLambda: (Int, Int) -> Unit) {

        myLambda(a, b)

    }

}

fun main() {
    var test = Testing()
// closure is to modify in kotlin , the value outside the lambda expression
    var result = 0

    test.addTwoNumber(5, 5, { x, y -> result = x + y })
    print(result)

}
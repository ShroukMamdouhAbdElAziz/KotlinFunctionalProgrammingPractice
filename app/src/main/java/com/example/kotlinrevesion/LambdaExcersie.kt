package com.example.kotlinrevesion

class Test {

    fun addTwoNumbers(a: Int, b: Int, myLambda: (Int) -> Unit) {
        var sum = a + b
        myLambda(sum)
    }

    fun addTwoNumber(a: Int, b: Int, myLambda: (Int, Int) -> Int) {

        var result = myLambda(a, b)
        print(result)
    }

}

fun main() {
    var test = Test()
    var myLambda : (Int) ->Unit = {x -> println(x)}

    test.addTwoNumbers(5, 5, { x -> println(x) })

    test.addTwoNumbers(5, 5) { x -> println(x) }

    test.addTwoNumbers(5, 2, myLambda)

    var action: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

    test.addTwoNumber(5, 3, action)

}
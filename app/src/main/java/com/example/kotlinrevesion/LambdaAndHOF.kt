package com.example.kotlinrevesion

class Program {
    //  using Interface , the OOP paradium
    fun addTwoNumbers(a: Int, b: Int, action: MyInterface) {
        val sum = a + b
        action.execute(sum)

    }

    // using High order Function by passing lambda function as a parameter
    fun addTwoNumbers(a: Int, b: Int, myLambdaMethod: (Int) -> Unit) {
        val sum = a + b
        myLambdaMethod(sum)  // with replaced by println(sum)

    }

}

//  using Interface , the OOP paradium
interface MyInterface {
    fun execute(sum: Int)

}

fun main() {

    //  using Interface , the OOP paradium
    val program = Program()
    program.addTwoNumbers(2, 5, object : MyInterface {
        override fun execute(sum: Int) {
            println(sum)
        }
    })

    // using High order Function by passing lambda function as a parameter
    val myLambda: (Int) -> Unit = { s: Int -> println(s) }
    program.addTwoNumbers(2, 8, myLambda)
    // or the below
    program.addTwoNumbers(2, 8, { s: Int -> println(s) })
}
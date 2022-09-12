package com.example.kotlinrevesion

class Person {
    var name: String = " "
    var age: Int = -1

    fun startRun() {
        println("Now i am ready to Run")
    }
}

fun main() {
    var person = Person1()
    /*person.name = "Shrouk"
    person.age = 23 */

    with(person
    ) {
        name = "Shrouk"
        age = 23
    }

    /*   person.apply {
           name = "Shrouk"
           age = 23
       }.startRun()*/

    println(person.name)
    println(person.age)
}
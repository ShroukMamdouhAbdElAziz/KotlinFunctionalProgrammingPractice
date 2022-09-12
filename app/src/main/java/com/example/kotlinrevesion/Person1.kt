package com.example.kotlinrevesion

// scope functions (with , apply , also , let , run )

class Person1 {

    var name: String? = null
    var age: Int? = null

}

class Person2 {
    var name: String = "Shrouk"
    var age: Int = 23
}

fun main() {

    // normal code
    var person = Person1()
    person.name = "Shrouk"
    person.age = 23
//==============================================================================================================
    // code using scope function , apply
    // property 1 : refer to context object by using this
    // property 2:  the return value  is the lambda result (which is the last statement of lambda expression

    var result2 = person.apply {
        name = "Ali"
        age = 5


    }

    println(result2)
//==============================================================================================================

    // code using scope function , with
    // property 1 : refer to context object by using this
    // property 2:  the return value  is the lambda result (which is the last statement of lambda expression

    var person2 = Person2()

    var result: String = with(person2) {
        name = "Kareem"
        age = 10
        age + 5
        "Hello"
        "Welcome"

    }
    println(result)

//==============================================================================================================

    // code using scope function , also

    // also finction used when you want to perform additional operations on particular object after initialize it.
    // the object here is mutableList :MutableList<Int> then initalized it by = mutableListOf(1,2,3)

    // property 1 : refer to context object by using it
    // property 2:  the return value  is the context object

    var mutableList: MutableList<Int> = mutableListOf(1, 2, 3)

    // some other code ... maybe a function call or a program to swap two numbers

    // operations on the numbersList
    var duplicatedList = mutableList.also {
        println("The list elements are :$it")
        it.add(4)
        println("The list elements after adding an element :$it")
        it.remove(2)
        println("The updated list :$it")
    }

    println("Original numbers: $mutableList")
    println("Duplicate numbers: $mutableList")
//==============================================================================================================

    // another Example on using also scope function
    // after initialize the person Object , we can perfom additional operations like modify the property

    var person4 = Person2()
    person4.apply {
        name = "Omar"
        age = 4
    }

    // perform additional operations using also function
    person4.also {
        // modify the name
        it.name = "Amir"
        println("New Name :${it.name}")
    }

//==============================================================================================================
    // code using scope function , let
    // property 1 : refer to context object by using it
    // property 2:  the return value  is the lambda result (which is the last statement of lambda expression
    // Use Let function to avoid NullPointerException by using null safe call with it

    var name: String = "Ali"
    var myResult = name?.let {
        println(it.reversed())
        println(it.uppercase())
        it.length

    }
    println(myResult)

//==============================================================================================================

    // code using scope function , run
    // it is the combination between with function && let function
    // property 1 : refer to context object by using this
    // property 2:  the return value  is the lambda result (which is the last statement of lambda expression

    var person10 :Person2 ? = Person2()

    var finalResult=  person10?.run {
        name = "Malak"
        age = 10
        age+=5
        "HELLO"
    }

    println(finalResult)
//==============================================================================================================
     // summary
    // with : if you want to operate on a non _ null object
    // apply : if you want to initialize or configure an object
    // let : if you want to execute lambda expression on a nullable object and avoid NullPointerException
    // run : is the combination betwwen with and let , if you want to operate on a nullable object (let), exceute lambda
    // expression (with) and avoid null pointer Exception
}
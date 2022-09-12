package com.example.kotlinrevesion

// it : is implicit name of single parameter while using lambda
// it is only applicable , if we have only one parameter inside the lambda expression
class Test1 {

    // hihg order function by passing lambda
    fun reverseAndDisplay(st:String , myFunc:(String) -> String){
      var result =  myFunc(st)
        print(result)
    }
}

fun main(){

    var test = Test1()
    test.reverseAndDisplay("hello",{
        it.reversed()})
}



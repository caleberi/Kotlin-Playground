package com.kotlinplayground.interfaces

interface  A {
    fun doSomething(){
        println("doSomething in A")
    }
}

interface  B {
    fun doSomething(){
        println("doSomething in B")
    }
}

class ConflicitingInterfaces : A,B {
    override  fun doSomething(){
        super<A>.doSomething()
        super<B>.doSomething()
        println("doSomething in  Conflicting Class")
    }
}


fun main(){
    ConflicitingInterfaces().doSomething()
}
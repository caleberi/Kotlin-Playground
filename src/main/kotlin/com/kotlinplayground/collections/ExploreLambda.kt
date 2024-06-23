package com.kotlinplayground.collections


fun calculate(x :Int, y: Int , op : (x: Int,y: Int) -> Int ): Int = op(x,y)
fun main(){

    val addLambda =  {x: Int ,y :Int -> x * y}

    val addResult =  addLambda(3,8)
    println("addResult : ${addResult}")

    val multiplyLambda = { x:Int,y:Int ->
        println("x is $x and y is $y")
        x * y
    }
    val multipleResult = multiplyLambda(45,67)
    println(multipleResult)

    println("${calculate(3,6, addLambda)}")

    val numList = listOf<Int>(1,2,3,4,5,6)

    val result =  numList.filter { x:Int -> x %2 == 0  }
}
package com.kotlinplayground.basics

fun main(){
    val range =  1 .. 10
    for ( i in range) {
        print("i: $i ")
    }
    println()
    val reverseRange =  10 downTo  1
    for ( i in range) {
        print("i: $i ")
    }
    println()
    for ( i in range step 2) {
        print("i: $i ")
    }

//    exploreWhile()
//    exploreDoWhile()
    label()
}

fun exploreDoWhile() {
   var i = 0;
    do {
        println("Value of i is $i")
        i++
    }while (i < 10)
}

fun exploreWhile() {
    var x = 1
    while (x < 100) {
        println("Value of x is $x")
        x++
    }
}

fun label(){
    println()
    loop@ for(i in 2..200){
//        println("i in label $i")
//        if (i == 3) break@loop
       innerloop@ for (j in i .. 100 ){
            println("i in label $i")
            if (j == i) continue@loop
        }
    }
}
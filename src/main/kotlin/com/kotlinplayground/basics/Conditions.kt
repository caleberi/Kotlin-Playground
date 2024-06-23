package com.kotlinplayground.basics

fun  main(){
     // if-else
    // when

    var name =  "Alex"
    name = "Chloe";

    val result: String = if (name.length == 4) {
        "Name is four characters"
    } else {
        "Name is not four characters"
    }

    println(result);

    val position = 1;
//    val medal = if (position == 1) {
//        "GOLD"
//    } else if (position == 2) {
//        "SILVER"
//    } else if (position == 3 ) {
//        "BRONZE"
//    }else {
//        "NO MEDAL"
//    }

    val medal = when (position) {
        1 ->   "GOLD"
        2 -> "SILVER"
        3 ->  "BRONZE"
        else -> "NO MEDAL"
    }

    println("MEDAL => $medal")

}
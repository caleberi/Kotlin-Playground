package com.kotlinplayground.nulls


fun main(){
    var nameNullable :String? = null
    println("Value is :  $nameNullable")

    nameNullable = "Go-mak"

    var name : String? = "Dilip";

    var length = nameNullable?.length ?: 0;

    println("${length}")

}
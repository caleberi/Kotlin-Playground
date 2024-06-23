package com.kotlinplayground.exceptions

import java.lang.Exception
import java.lang.RuntimeException


fun returnNothing() : Nothing {
    throw RuntimeException("Exception")
}

fun mainx()  {
    try {
        nameLength(null)
    } catch (ex: kotlin.KotlinNullPointerException){
        println("Exception is :$ex");
    }
}

fun nameLength(name:String?) {
    name!!.length
}

fun main()  {
    nameLengthV2(null)
}

fun nameLengthV2(name:String?) : Int?{
    val result =  try {
        name!!.length
    }catch (ex:Exception){
        println("ex: $ex")
        null
    }

    return result
}
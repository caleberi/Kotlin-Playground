package com.kotlinplayground.basics

import java.time.LocalDate

fun  printName(name :String): Unit{
    println("Name is ${name}")
}

fun additionApproach(x: Int, y: Int) : Int = x+y

fun addition(x: Int, y: Int) : Int {
    return x + y;
}

fun printPersonDetails(name: String,email :String="", dob: LocalDate= LocalDate.now()){
    println("Name is $name and the email is $email [${dob}]")
}

fun topLevelFunction() : Int {
    return (0..56).random()
}

fun main(){
    printName("Caleb")
    val result = addition(3,4)
    println(result);
    println(additionApproach(1,2))
    printPersonDetails("Caleb", dob = LocalDate.parse("2001-05-21"), email = "caleb@example.com")
    printPersonDetails("Caleb", email = "abc@gmail.com")

    val num = topLevelFunction()
    println("$num")
}



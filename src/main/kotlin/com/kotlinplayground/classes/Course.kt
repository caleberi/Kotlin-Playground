package com.kotlinplayground.classes

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

data class Course(
    val id :Int,
    val name: String,
    val author: String,
    val category : CourseCategory = CourseCategory.DEVELOPMENT
){}


data class  Employee(
    val id:Int,
    val name:String,
    val age :Int,
    val salary :Double
){}

fun main(){
    val course = Course(
        id = 1,
        name = "Reactive programming in mordern java",
        author = "Dilip",
        category = CourseCategory.DESIGN
    )

    println(course)

    val course1 = Course(
        id = 1,
        name = "Reactive programming in mordern java",
        author = "Caleb",
        category =  CourseCategory.BUSINESS
    )

    println("Checking object equality ${course == course1}" )

    val copied = course1.copy(name = "Kotlin master class")
    println(copied)

    val employee1 = Employee(1,"Sola Grace",34,703_834_934.00)
    println("$employee1")
    val employee2 = employee1.copy()
    println("employee2 == employee : ${employee1 == employee2}")

    val employee3 = employee1.copy(age = 12, salary = 2000.9, name = "Folashade Grace")
    println("employee2 == employee : ${employee1 == employee2}")
}

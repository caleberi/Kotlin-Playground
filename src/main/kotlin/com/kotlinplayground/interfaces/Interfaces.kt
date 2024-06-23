package com.kotlinplayground.interfaces

import com.kotlinplayground.classes.Course

interface  Repository {
    fun getAll() : Unit{
        println("Get all information")
        return
    }
}
interface CourseRepository {
    val isCourseRegistered :Boolean
    fun getById(id:Int) : Course
    fun save(course: Course) : Int {
        println("course : $course")
        return course.id
    }
}


class SqlCourseRepository :  CourseRepository, Repository {
    override var isCourseRegistered: Boolean = false
        get() = field


    override  fun  getById(id: Int): Course {
        return Course(
            id,
            name = "Reactive programming in Modern Java using project Reactor",
            "Alex"
        )
    }


    override fun save(course: Course): Int {
        this.isCourseRegistered = true
        println("sql course : $course")
        return course.id
    }
}


class NoSqlCourseRepository :  CourseRepository {
    override val isCourseRegistered: Boolean = false
        get()  = field

    override  fun  getById(id: Int): Course {
        return Course(
            id,
            name = "Querying with MongoDB",
            "Mattew"
        )
    }
}

fun main(){
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(3)
    println("course is saved ${sqlCourseRepository.save(course)}")

    println("Course is $course")
    val nosqlCourseRepository = NoSqlCourseRepository()
    val course1 = nosqlCourseRepository.getById(33)

    println("Course is $course1")
    println(sqlCourseRepository.getAll())
    println("course is saved ${nosqlCourseRepository.save(course1)}")

}
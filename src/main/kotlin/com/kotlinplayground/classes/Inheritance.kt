package com.kotlinplayground.classes

 open class User(val name: String){
     open val isLoggedIn :  Boolean = true
     open  val isValidated: Boolean = true
    open fun login(){
        println("Inside user login")
    }

    protected open fun secret(){
         println("Private secret")
    }
}


class Student(name :String) :User(name){
    companion object {
        const val nosOfEnrolledCourse = 10
        fun country() = "USA"
    }
}

class Instructor(name:String) : User(name) {
    override var isLoggedIn: Boolean = false

    override var isValidated: Boolean = true
        get() = field ||super.isValidated
        set(value) {
            field = !value
        }
    override fun login() {
        super.login()
        println("inside instructor login")
    }
}


fun main(){
//    val user = User("Ana")
    val student =  Student("Jenna")
    student.login()

    println("name is : ${student.name}")

    val instructor = Instructor("Alex")

    println("name is : ${instructor.name}")

    instructor.login()

    val country = Student.country()

    println(country)

    println("number of enrolled courses, ${Student.nosOfEnrolledCourse}")
}
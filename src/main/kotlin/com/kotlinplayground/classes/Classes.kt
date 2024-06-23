package com.kotlinplayground.classes

class Person (var name:String = "", var age:Int = 0) {
    var email:String = ""
    var nameLength: Int = 0
    init{
        println("Starting for Person")
        nameLength = name.length

    }
    constructor(_email:String,_name:String,_age:Int=0):this(_name,_age){
        email = _email
        name = _name
        age = _age

    }
    fun action(){
        println("Person Walks")
        println("Length: ${this.nameLength}")
    }

}


fun main(){
    val person =  Person(name = "Alex", age = 23)
    person.action()
    println("Name:  ${person.name} and age is ${person.age}")

    val person1 = Person("test@gmail.com", person.name, person.age)
    println("person1 : ${person1.email}")
}
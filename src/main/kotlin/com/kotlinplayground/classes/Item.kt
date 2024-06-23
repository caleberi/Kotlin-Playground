package com.kotlinplayground.classes

import java.lang.IllegalArgumentException

class Item() {

    var name : String = ""
    var price : Double = 0.0
        get(){
            println("Inside getter")
            return field
        }

        set(value){
            println("Inside Setter")
            if (value >= 0.0){
                field = value
            }else {
                throw  IllegalArgumentException("Negative price is not allowed")
            }
        }
    constructor(_name :String) : this(){
        name = _name
    }
}


fun main(){
    val item = Item(_name = "Iphone")
    println("Item name is ${item.name}")
    item.name = "Iphone 13"
    item.price = 450.0
    println("Item name is ${item.name}")
    println(item.price)
}
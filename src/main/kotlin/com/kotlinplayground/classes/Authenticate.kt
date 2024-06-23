package com.kotlinplayground.classes

import java.net.PasswordAuthentication

object Authenticate {
    fun authenticate(user: User,passwordAuthentication: PasswordAuthentication):kotlin.Boolean{
        return user.name == passwordAuthentication.userName
    }
}

fun main(){
    Authenticate.authenticate(User(name = "Caleb"),PasswordAuthentication("Caleb", charArrayOf()))
}
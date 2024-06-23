package com.kotlinplayground.collections

const val x = 9;
fun main(){
    val students = listOf<String>("Alex","Stan","William");

    println(students[0])
    var itr  = students.listIterator();

    while (itr.hasNext()){
        println(itr.next())
    }

    var queue = mutableListOf<Int>()
    var sets = mutableSetOf<Int>()
    for (i in 1..90){
        queue.add(i);
    }

    for ( i in 0..queue.size){
        sets.add(i%2)
    }

    println(queue)
    println(sets)



    val mapp = mapOf<String,Int>("Time" to (23%x) , "Song" to 56)
    print(mapp)

    var elements = students.map { x : String ->x.length }
    println(elements)


}
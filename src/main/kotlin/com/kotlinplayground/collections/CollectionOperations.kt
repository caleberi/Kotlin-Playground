package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList

fun main(){
    val courseList: MutableList<Course> = courseList();

    val names = exploreFilter(courseList) { c -> c.category == CourseCategory.DEVELOPMENT }.map { it.name }

    var i = 1;
    val itr = names.listIterator();
    while (itr.hasNext()) {
        println("$i : ${itr.next()}");
        i++;
    }


    val namesListUsingSequence = listOf<String>("alex","ben","chloe")
        .asSequence()
        .filter { it.length >= 4 }
        .map { it.uppercase() }
        .toList();

    println("namesListUsingSequence : $namesListUsingSequence")

}

fun exploreFilter(courseList: MutableList<Course>, filterOp: (Course) -> Boolean) : List<Course>{
    return courseList.filter(filterOp)
}

package com.chris.kotlindemo

/**
 * Created by Admin on 2018/11/12.
 */
class Student(name:String): Person(name) {

    var name: String? = null
        get() = field + "cccc"
        set(value) {field = value+"dddd"}

    constructor(name: String, age: Int):this(name) {
        println("age : $age")
    }
    init {
        println("hello $name")
        this.name = name
    }
}

fun main(args:Array<String>) {
    var s = Student("Chris", 25)
    println("s.name:${s.name}")
}
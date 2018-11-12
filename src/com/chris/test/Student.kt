package com.chris.test

class Student(var name:String) {
    var age = 0
    constructor(name:String, age:Int) : this(name) {
        this.age = age
        println("age : ${this.age}")
    }
    init {
        println("student $name init")

    }


}

fun main(args : Array<String>) {
    var student = Student("Chris", 25)
}
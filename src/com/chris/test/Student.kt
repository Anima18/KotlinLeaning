package com.chris.test

class Student(name:String) : Learnable {
    var age = 0
    var name: String? = null
    override var flag: Boolean = false
    constructor(name:String, age:Int) : this(name) {
        this.age = age
        println("age : ${this.age}")
    }
    init {
        println("student $name init")
        this.name = name
        flag = true
    }

    override fun reading() {
        println("$name is reading")
    }

    override fun write() {
        super.write()
        println("$name is write")
    }
}

fun main(args : Array<String>) {
    var student = Student("Chris", 25)
    student.reading()
    student.write()
}
package com.chris.test

import kotlin.math.max

fun sayHi(name:String) : String {
    return "hello, $name!"
}

fun maxNum(a:Int, b:Int):Int {
    val max = if (a > b) a else b;
    return max
}

fun testWhen(x:Int) {
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }
}

fun testFor() {
    for (x in 1..10) {
        println(x)
        if(x == 5) {
            break
        }
    }
}

fun main(args : Array<String>) {
    println(sayHi("Kotlin"))

    println("max(1, 2) is ${max(1, 2)}")

    testWhen(1)

    testFor()
}
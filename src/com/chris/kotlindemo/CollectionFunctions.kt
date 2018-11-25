package com.chris.kotlindemo

/**
 * Created by Admin on 2018/11/24.
 */
fun main(args:Array<String>) {
    /*println("========aggregateOperations==========")
    aggregateOperations()*/

    /*println("========filteringOperations==========")
    filteringOperations()*/
    /*println("========mapOperations==========")
    mapOperations()*/

    println("========elementsOperations==========")
    elementsOperations()
}

fun aggregateOperations() {
    val data = listOf<Int>(1, 2, 3, 4, 5, 6)

    println("any :${data.any {it > 5}}")
    println("all :${data.all {it > 5}}")
    println("count :${data.count {it > 5}}")
    println("fold :${data.fold(10) {total, next -> total + next}}")
    println("reduce :${data.reduce {total, next -> total + next}}")
    println("${data.forEach { print("$it, ")}}")
}

fun filteringOperations() {
    val data = listOf<Int>(1, 2, 3, 4, 5, 6)

    println("drop :${data.drop(1)}")
    println("dropWhile :${data.dropWhile { it < 3 }}")
    println("dropLastWhile :${data.dropLastWhile { it < 3 }}")
    println("filter :${data.filter { it < 3 }}")
    println("filterNot :${data.filterNot { it < 3 }}")
    println("filterNotNull :${data.filterNotNull()}")
}

fun mapOperations() {
    val data = listOf<Int>(1, 2, 3, 4, 5, 6)
    println("map :${data.map { it *2 }}")
    println("flatMap :${data.flatMap { listOf("$it", "ddd") }}")
    println("groupBy:${data.groupBy { if (it % 2 == 0) "even" else "odd" }}")
}

fun elementsOperations() {
    val data = listOf<Int>(1, 2, 3,10, 5, 6, 10)
    println("contains :${data.contains(2)}")
    println("elementAt :${data.elementAt(2)}")
    println("elementAtOrElse :${data.elementAtOrElse(7, {-1})}")
    println("elementAtOrNull :${data.elementAtOrNull(7)}")
    println("first :${data.first()}")
    println("first :${data.first { it % 2== 0 }}")
    println("firstOrNull :${data.firstOrNull{ it==7 }}")
    println("last :${data.last()}")
    println("last :${data.last { it % 3 == 0 }}")
    println("lastIndexOf :${data.lastIndexOf(10)}")
    println("indexOf :${data.indexOf(10)}")
    println("indexOfFirst :${data.indexOfFirst { it % 5 == 0 }}")
    println("indexOfLast :${data.indexOfLast { it % 5 == 0 }}")

}
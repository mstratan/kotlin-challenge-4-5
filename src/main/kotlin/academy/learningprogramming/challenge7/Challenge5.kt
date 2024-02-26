package academy.learnprogramming.challenge7

import java.lang.StringBuilder

fun main() {

    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)

    //1
    val (fName, lName, age) = joe
    println("fName = $fName, lName = $lName, age = $age")

    //2
    val personMap = mapOf(joe.lastName to joe, jane.lastName to jane, mary.lastName to mary,
        john.lastName to john, jean.lastName to jean)

    //3
    println(personMap.count { it.key.startsWith("S") })

    //4
    val firstNames = personMap.map { it.value.firstName }
    val lastNames = personMap.map { it.value.lastName }
    println(firstNames.zip(lastNames));

    //5
    personMap.also { it.map { println("${it.value.firstName} is ${it.value.age} years old") } }

    //6
    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf(4, 55, -83, 15, 22, 101)

    val list3 = list1.intersect(list2)
    println(list3)

    //7
    val regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    paper = regularPaper
}


data class Person(val firstName: String, val lastName: String, val age: Int) {

}


class Box<out T> {

}

open class Paper {

}

class Regular: Paper() {

}

class Premium: Paper() {

}
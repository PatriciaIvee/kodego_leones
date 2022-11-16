package oop

import notes.Parent
import notes.Person
import notes.Student
import notes.TeacherAgain
import java.util.*

open class Person{
    var firstName = ""
        get() = field
        private set(value){
            field = value
        }
// Encapsulation: you can set "set" to private to limit access to the variable

    var middleName = ""
    var lastName = ""
    var birthDate = Date()
    var address = ""

    private fun setAge(){ /*should be private so no one can change it*/ }
    public fun fullName() = "$lastName, $firstName $middleName "
    //    by default every class is public
    constructor()
    constructor(firstname:String,lastname:String){
        this.firstName = firstName
        this.lastName = lastName
    }

}

class Student(firstname:String,lastname:String): Person(){
    var gradeLevel: String = ""
}

class Parent(firstname:String,lastname:String): Person(){
    var parentInfo: String = ""
}
interface Dancer{
    fun dancer(){}
}

class TeacherAgain(firstname:String,lastname:String): Person(){
    var section : String = ""
}

fun main() {
var population: ArrayList<Person> = ArrayList()
population.add(Student("Janreign","Aragon"))
population.add(Parent("Victor","Yu"))
population.add(TeacherAgain("Pat","Leones"))

for(individual in population){
    println("Class:${individual.javaClass.toString()}")
//        println(individual.fullname())

    when(individual){
        is Student -> {
            println("Student:${individual.fullName()}")
            var student = individual as Student
            student.gradeLevel = ""
        }
        is Parent ->
            println("Parent:${individual.fullName()}")
        is TeacherAgain ->
            println("Teacher:${individual.fullName()}")
        else ->
            println("Error Occurred")
    }
}
}
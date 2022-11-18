package oop

import java.util.*

interface GuidanceCounselor{
    var something: String
    fun doConsult()
}

open class Person{
    var firstName = ""
        private set
// Encapsulation: you can set "set" to private to limit access to the variable

    var middleName = ""
    var lastName = ""
    var birthDate = Date()
    var address = ""

    private fun setAge(){ /*should be private so no one can change it*/ }
    public fun fullName() = "$lastName, $firstName $middleName "
    //    by default every class is public
//    constructor()
    constructor(firstName:String,lastName:String){
        this.firstName = firstName
        this.lastName = lastName
    }

}

class Student(firstName:String,lastName:String): Person(firstName, lastName){
    var gradeLevel: String = ""
}

class Parent(firstName:String,lastName:String): Person(firstName, lastName){
    var parentInfo: String = ""
}
interface Dancer{
    fun dancer(){}
}
//Multiple inheritance interface
class Teacher(firstName:String,lastName:String): Person(firstName, lastName), GuidanceCounselor{
    var section : String = ""
    override var something: String
        get() = TODO("Not yet implemented")
        set(value) {}
    override fun doConsult(){
        TODO()
    }
}

class TeacherCounselor(firstName: String,lastName: String): Person(firstName,lastName), GuidanceCounselor{
    override var something: String
        get() = TODO("Not yet implemented")
        set(value) {}
    override fun doConsult() {
        TODO("Not yet implemented")
    }
}

abstract class SubstituteTeacher{
    abstract fun teacherClass()

    fun teach(){

    }

//            you can inherit and instantiate abstract class
}

fun main() {
    var population: ArrayList<Person> = ArrayList()

    var person: Person = Student("Janreign","Aragon")
    population.add(person)

    person = Parent("Victor","Yu")
    population.add(person)

    person = Teacher("Pat","Lee")
    population.add(person)

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
        is Teacher ->
            println("Teacher:${individual.fullName()}")
        is TeacherCounselor ->{

        }
        is SubstituteTeacher ->{

        }
        else ->
            println("Error Occurred")

    }

}
//    Polymorph stuff
}
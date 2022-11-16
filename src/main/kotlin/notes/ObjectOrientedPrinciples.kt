package notes

import java.util.*
import kotlin.collections.ArrayList

//Abstraction
//Encapsulation
//Inheritance
//Polymorphism

var numbers = intArrayOf(1,2,3,4,5)
var average = numbers.average()// you don't know how this one behaves

class Work{
    private var salary: Double = 0.00
    private var bankAccount: String = ""
    private var sss:String = ""
    private var password: String = ""
    private var contract: String = ""
    var position : String = ""
    var workSchedule = ""
    var properties: ArrayList<String> = ArrayList()
}

//Abstraction: You don't know how the function is being implemented
// it hides how it is done, but you know what it does
class Teacher{
    var students = ArrayList<StudentEx1>()

    fun computeGrades(){
        for (student in students){
            student.computeGrade()
        }
    }
}

class StudentEx1{
    fun computeGrade(){

    }
}
//also an example of abstraction and polymorphism

interface Car{
    fun turnRightSignal(){}
    fun gasLevel(){}
}
//one way to implement abstraction
class Honda{
    fun turnRightSignal(){}
//    override fun turnRightSignal(){}
    //    example of method that needs to be seen by people
    private fun gasLevel(){}
//    override fun gasLevel(){}
//while private is things that people can't see

}
class Mitsubishi:Car{
    override fun turnRightSignal() {

    }
    override fun gasLevel(){}
}
//Inheritance
// it can be called to other functions that
// use open to make it available for other functions
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

class Student(firstname:String,lastname:String):Person(){
    var gradeLevel: String = ""
}

class Parent(firstname:String,lastname:String):Person(){
    var parentInfo: String = ""
}
interface Dancer{
    fun dancer(){}
}

class TeacherAgain(firstname:String,lastname:String):Person(){
    var section : String = ""
}

class Robot: Person(),Dancer, Car{
    override fun turnRightSignal() {
        TODO("Not Yet Implemented")
//        super.turnRightSignal() I don't know what this does
        /*
        The super() function is used to give access to methods
        and properties of a parent or sibling class.
        The super() function returns an object that represents
        the parent class.
         */
    }
    override fun gasLevel(){
        TODO("Not Yet Implemented")
    }
}

abstract class Employee:Person(){
    abstract fun clockIn()
    abstract fun clockOut()
//    This is hidden because some work no longer require time in and out
//    Work From Home
}

//Polymorphism

fun main() {
//    var teacher: Teacher = Teacher()
//    var student: Student = Student()
//    var parent: Parent = Parent()
//    var robot: Robot = Robot()
//    var person = Person()

//    parent = Person()
//    teacher = Person()
//    student = Person()
//    robot = Person()
//    you can make the teacher a person,but you cannot make person as a teacher

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


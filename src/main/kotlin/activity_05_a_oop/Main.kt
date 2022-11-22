package activity_05_a_oop


import java.time.format.DateTimeFormatter
import java.util.Date


/**
 * Scope : Use inheritance on Students
 * Create a person class with firstname, middlename, lastname, address and birthday.
 *
 * Create a Student class that inherits the Person class.
 * A student has a year he/she entered the school. A student has an ID.
 *
 * Create a CertificateStudent, UnderGraduateStudent, MasterStudent, and GraduateStudent.
 * A student has different statuses
 * Status : Leave of Absence, Ongoing, Graduated, Will Begin, Unknown, Shifted,
 * The Certificate Student has a list of short courses he or she has gotten.
 *
 * Example:
 * Student 1, Computer Technician, Network Technician, Electrical Technician
 * Student 2, Public Speaking, Debate, Advertising Article
 *
 * The Undergraduate Student has a list of college(s) he or she belongs to,
 * there is a year he or she joined the college, there is a list degrees he or she is taking,
 * there is a start and year of the degree, there is also different statuses.
 *
 * Example :
 * Undergraduate Student 1,  College of Engineering, Bachelor of Interior Design, 2020(start), 2022(end)
 * Note : end will only contain a value if he or she is done with the course
 *
 * The Master Student has a list of college(s) he or she belongs to,
 * there is a year he or she joined the college, and has name of the master degree he or she is getting.
 */



open class Person{
    var firstName: String = ""
    var middleName: String = ""
    var lastName: String = ""
    var address: String = ""


    open var formatter: DateTimeFormatter? = DateTimeFormatter.ofPattern("MM-dd-yyyy")
    var birthDate = Date()

    fun fullName() = "$lastName, $firstName $middleName"

    constructor(firstName: String, lastName: String){
        this.firstName = firstName
        this.lastName = lastName
    }
}

class Student(firstName: String,lastName: String): Person(firstName, lastName){
    override var formatter: DateTimeFormatter? = DateTimeFormatter.ofPattern("yyyy")
    var yearEnrolled = Date()
    var studentID: String = ""

}

class CertificateStudent(firstName: String,lastName: String): Person(firstName, lastName) {
    var shortCoursesList: List<String> = listOf()
}
class UnderGraduateStudent(firstName: String,lastName: String): Person(firstName, lastName){
    var collegeList: List<String> = listOf()
    var degreesTakenOrTakingList: List<String> =  listOf()
    override var formatter: DateTimeFormatter? = DateTimeFormatter.ofPattern("yyyy")
    var yearEnrolled = Date()
    var yearEnd = Date()
}

class MasterStudent(firstName: String,lastName: String): Person(firstName, lastName) {
    override var formatter: DateTimeFormatter? = DateTimeFormatter.ofPattern("yyyy")
    var yearEnrolled = Date()
    var yearEnd = Date()
    var degree: String = ""
}
class GraduateStudent(firstName: String,lastName: String): Person(firstName, lastName) {
    override var formatter: DateTimeFormatter? = DateTimeFormatter.ofPattern("yyyy")
    var yearEnrolled = Date()
    var yearEnd = Date()
    var degree: String = ""

}

enum class Status {
    LEAVE_OF_ABSENCE,
    ONGOING,
    GRADUATED,
    WILL_BEGIN,
    SHIFTED,
    UNKNOWN
}

fun main() {
    var population: ArrayList<Person> = ArrayList()

    var person: Person = Student("Janreign","Aragon")
    population.add(person)

    person= Student("Jani","Arcena")
    population.add(person)

    person = CertificateStudent("Manny", "Pacquiao")
    population.add(person)

    person = UnderGraduateStudent("Pat","Leones")
    population.add(person)

    person = MasterStudent("Mac","Valmores")
    population.add(person)

    person = GraduateStudent("Juan Ponce", "Enrile")
    population.add(person)

    for(individual in population) {
        println("Class:${individual.javaClass.toString()}")


        when (individual) {
            is Student -> {
                println("Student:${individual.fullName()}")
                var student = individual as Student
                student.studentID = ""
                student.yearEnrolled = Date(2022)
                Status.ONGOING

            }

            is CertificateStudent -> {
                println("Certificate Student:${individual.fullName()}")
                var certificateStudent = individual as CertificateStudent
                certificateStudent.shortCoursesList = listOf()
            }

            is UnderGraduateStudent -> {
                println("Undergraduate Student:${individual.fullName()}")
            }

            is MasterStudent -> {
                println("Teacher:${individual.fullName()}")
            }

            is GraduateStudent -> {
                println("Graduate Student:${individual.fullName()}")
            }

            else ->
                println("Error Occurred")

        }
    }
}
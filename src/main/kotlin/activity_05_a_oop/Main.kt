package activity_05_a_oop


import mu.KotlinLogging
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month
import java.time.Year
import java.time.format.DateTimeFormatter
import java.util.Date

private val logger = KotlinLogging.logger {  }
/**
 * Scope : Use inheritance on Students
 * Create a person class with firstname, middlename, lastname, address and birthday.
 *
 * Create a Student class that inherits the Person class.
 * A student has a year he/she entered the school. A student has an ID.
 *
 * Create a CertificateStudent, UnderGraduateStudent, MasterStudent, and GraduateStudent.
 * A student has different statuses
 *
 *
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


fun main() {
    val population: ArrayList<Person> = ArrayList()

    var person: Person = Student("Janreign","Aragon")
    person.birthDate = Date(1999,12,1)
    population.add(person)

    person= Student("Jani","Arcena")
    population.add(person)

//    Student 1
    person = CertificateStudent("Manny", "Pacquiao")
    var certStudent:CertificateStudent = person
    certStudent.shortCoursesList.add("Computer Technician")
    certStudent.shortCoursesList.add("Network Technician")
    certStudent.shortCoursesList.add("Electrical Technician")
    population.add(person)

//    Student 2
    person = CertificateStudent("Arturo", "Buenavista")
    certStudent = person
    certStudent.shortCoursesList.add("Public Speaking")
    certStudent.shortCoursesList.add("Debate")
    certStudent.shortCoursesList.add("Advertising Article")
    population.add(person)

    person = UnderGraduateStudent("Pat","Leones")
    var undergrad:UnderGraduateStudent = person
    undergrad.collegeSchoolOf.add("College of Engineering")
    undergrad.degreesTakenOrTakingList.add("Bachelor of Interior Design")
    undergrad.yearEnrolled = 2020
    undergrad.yearEnd = 2022

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
                println("Birthday: ${person.birthDate}")
                val student = individual as Student
                student.studentID = ""
                student.yearEnrolled = Date()
            }

            is CertificateStudent -> {
                println("Certificate Student:${individual.fullName()}")
                val certificateStudent = individual as CertificateStudent
                logger.info{"Certificates taken"}
                for (cert in certificateStudent.shortCoursesList) {
                    println(cert)
                }
            }

            is UnderGraduateStudent -> {
                println("Undergraduate Student:${individual.fullName()}")
                val underGraduateStudent = individual as UnderGraduateStudent
                logger.info { "School:" }
                for (department in underGraduateStudent.collegeSchoolOf){
                    println(department)
                }
                logger.info { "Degree:" }
                for (degree in underGraduateStudent.degreesTakenOrTakingList){
                    println(degree)
                }
                println("Year enrolled:${ underGraduateStudent.yearEnrolled }")
                println("Year end:${underGraduateStudent.yearEnd}")
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


open class Person{
    var firstName: String = ""
    var middleName: String = ""
    var lastName: String = ""
    var address: String = ""


    open var formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy")
//    var date = LocalDate.parse("0000-00-00")
    var birthDate = Date(0,0,0)


    fun fullName() = "$lastName, $firstName $middleName"

    constructor(firstName: String, lastName: String){
        this.firstName = firstName
        this.lastName = lastName
    }
}

class Student(firstName: String,lastName: String): Person(firstName, lastName){
//    override var formatter: DateTimeFormatter? = DateTimeFormatter.ofPattern("yyyy")

    var yearEnrolled = Date()
    var studentID: String = ""

}

class CertificateStudent(firstName: String,lastName: String): Person(firstName, lastName) {
    var shortCoursesList: ArrayList<String> = ArrayList()
}
class UnderGraduateStudent(firstName: String,lastName: String): Person(firstName, lastName){
    var collegeSchoolOf: ArrayList<String> = ArrayList()
    var degreesTakenOrTakingList: ArrayList<String> =  ArrayList()
//    override var formatter: DateTimeFormatter? = DateTimeFormatter.ofPattern("yyyy")
    var yearEnrolled : Int = 0
    var yearEnd : Int = 0
}

class MasterStudent(firstName: String,lastName: String): Person(firstName, lastName) {
//    override var formatter: DateTimeFormatter? = DateTimeFormatter.ofPattern("yyyy")
    var yearEnrolled: Int = 0
    var yearEnd : Int = 0
    var degree: String = ""
}
class GraduateStudent(firstName: String,lastName: String): Person(firstName, lastName) {
//    override var formatter: DateTimeFormatter? = DateTimeFormatter.ofPattern("yyyy")
    var yearEnrolled : Int = 0
    var yearEnd : Int = 0
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

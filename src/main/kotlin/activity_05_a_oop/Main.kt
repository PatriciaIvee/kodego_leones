package activity_05_a_oop


import mu.KotlinLogging

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


    //    Student 1
    var person: Person = Student("Janreign","Aragon")
    var student1:Student = person as Student
    student1.status = Status.ONGOING
    population.add(person)


    //    Student 2
    person = Student("Jani","Arcena")
    student1 = person as Student
    student1.status = Status.SHIFTED
    population.add(person)


    //    Student 3
    person = Student("Jose", "Santos")
    student1 = person as Student
    student1.status = Status.WILL_BEGIN
    population.add(person)


    //    Cert Student 1
    person = CertificateStudent("Manny", "Pacquiao")
    var certStudent:CertificateStudent = person
    certStudent.shortCoursesList.add("Computer Technician")
    certStudent.shortCoursesList.add("Network Technician")
    certStudent.shortCoursesList.add("Electrical Technician")
    population.add(person)

    //    Cert Student 2
    person = CertificateStudent("Arturo", "Buenavista")
    certStudent = person
    certStudent.shortCoursesList.add("Public Speaking")
    certStudent.shortCoursesList.add("Debate")
    certStudent.shortCoursesList.add("Advertising Article")
    population.add(person)

    //    Undergrad Student 1
    person = UnderGraduateStudent("Pat","Leones")
    var undergrad:UnderGraduateStudent = person
    undergrad.collegeSchoolOf.add("College of Engineering")
    undergrad.degreesTakenOrTakingList.add("Bachelor of Interior Design")
    undergrad.yearEnrolled = 2020
    undergrad.yearEnd = 2022
    undergrad.status = Status.GRADUATED

    population.add(person)


    //    Undergrad Student 2
    person = UnderGraduateStudent("Hannah","Montana")
    undergrad = person
    undergrad.collegeSchoolOf.add("College of Music and Performing Arts")
    undergrad.degreesTakenOrTakingList.add("Bachelor of Performing Arts")
    undergrad.status = Status.ONGOING

    population.add(person)

    //    Master Student 1
    person = MasterStudent("Mac","Valmores")
    population.add(person)

    //    Graduate Student 1
    person = GraduateStudent("Juan Ponce", "Enrile")
    population.add(person)



    for(individual in population) {
        println("Class:${individual.javaClass.toString()}")


        when (individual) {
            is Student -> {
                logger.info{"Student:${individual.fullName()}"}
                val student = individual as Student
                logger.info{"Status :${student.status}"}
            }

            is CertificateStudent -> {
                logger.info{"Certificate Student:${individual.fullName()}"}
                val certificateStudent = individual as CertificateStudent
                logger.info{"Certificates taken:"}
                for (cert in certificateStudent.shortCoursesList) {
                    logger.info{cert}
                }

            }

            is UnderGraduateStudent -> {
                logger.info{"Undergraduate Student:${individual.fullName()}"}
                val underGraduateStudent = individual as UnderGraduateStudent
                logger.info { "School:" }
                for (department in underGraduateStudent.collegeSchoolOf){
                    logger.info{department}
                }
                logger.info { "Degree:" }
                for (degree in underGraduateStudent.degreesTakenOrTakingList){
                    logger.info{degree}
                }
                logger.info{"Year enrolled:${ underGraduateStudent.yearEnrolled }"}
                logger.info{"Year end:${underGraduateStudent.yearEnd}"}
                logger.info{"Status :${underGraduateStudent.status}"}
            }

            is MasterStudent -> {
                logger.info{"Master Student:${individual.fullName()}"}
                logger.info{"Year Enrolled:${individual.yearEnrolled}"}
                logger.info{"Year End:${individual.yearEnd}"}
                logger.info{"Degree:${individual.degree}"}

            }

            is GraduateStudent -> {
                logger.info{"Graduate Student:${individual.fullName()}"}
                logger.info{"Year Enrolled:${individual.yearEnrolled}"}
                logger.info{"Year End:${individual.yearEnd}"}
                logger.info{"Degree:${individual.degree}"}
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

    var birthDate = Date()


    fun fullName() = "$lastName, $firstName $middleName"

    constructor(firstName: String, lastName: String){
        this.firstName = firstName
        this.lastName = lastName
    }
}

class Student(firstName: String,lastName: String): Person(firstName, lastName){
    var yearEnrolled = Date()
    var studentID: String = ""
    var status: Status = Status.UNKNOWN
    var grade: Float = 0.0F

    fun updateStatus(status: Status){
        this.status = status
    }

}

class CertificateStudent(firstName: String,lastName: String): Person(firstName, lastName) {
    var shortCoursesList: ArrayList<String> = ArrayList()
}
class UnderGraduateStudent(firstName: String,lastName: String): Person(firstName, lastName){
    var collegeSchoolOf: ArrayList<String> = ArrayList()
    var degreesTakenOrTakingList: ArrayList<String> =  ArrayList()
    var yearEnrolled : Int = 0
    var yearEnd : Int = 0
    var grade: Float = 0.0F
    var status:Status = Status.UNKNOWN
}

class MasterStudent(firstName: String,lastName: String): Person(firstName, lastName) {
    var yearEnrolled: Int = 0
    var yearEnd : Int = 0
    var degree: String = ""
    var grade: Float = 0.0F
    var status: Status = Status.UNKNOWN
}
class GraduateStudent(firstName: String,lastName: String): Person(firstName, lastName) {
    var yearEnrolled : Int = 0
    var yearEnd : Int = 0
    var degree: String = ""
    var grade: Float = 0.0F
    var status: Status = Status.UNKNOWN

}

enum class Status  {
    LEAVE_OF_ABSENCE,
    ONGOING,
    GRADUATED,
    WILL_BEGIN,
    SHIFTED,
    UNKNOWN
}

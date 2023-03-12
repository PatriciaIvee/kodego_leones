package activity_04_a

import mu.KotlinLogging
import java.util.*

import kotlin.collections.ArrayList

private val logger = KotlinLogging.logger {}


/**
 * Covered Topic(s) : Classes
 * Instructions :
 * 1. Use class to represent the student rather string.
 * Make sure the student has a firstName, lastName, nickName, id and year enrolled
 *
 * 2. Update the searchStudentWildSearch to search for the wild string in the
 * lastname, middle name, and firstname. Return
 * the Arraylist of students that match the searched string,
 * if there are no entries return an empty ArrayList.
 *
 * 3. Add a function searchStudentWildSearch that will accept a string
 * and either of the following values, lastname, middle name, nickname.
 *
 * This will search the specific wild string depending on where it was
 * mentioned to be searched for. Return the Arraylist of students that match the searched string,
 * if there are no entries return an empty ArrayList.
 */
fun main() {
    val studentNames: ArrayList<Student> = ArrayList()
    addNameToList(Student("Maria Patricia Jesus", "Ontario"),studentNames)
    studentNames.add(Student("Patricia Ivee","Leones"))
    studentNames.add(Student("Jejomar","Binay"))
    studentNames.add(Student("Manny","Pacquiao"))
    studentNames.add(Student("Mac","Valmores"))
    studentNames.add(Student("Patricia","Javier"))

    logger.info{"Student names: "}
    for(student in studentNames){
        logger.info{"Student:${student.fullName()}"}
    }

    logger.info{"Student Wild Search"}
    wildSearch("pat",studentNames)


}

class Student {
    var firstName: String = ""
    var lastName: String = ""
    var nickname: String = ""
    var ID :String = ""
    var yearEnrolled : String = ""
    fun fullName() = "$firstName $lastName"
    constructor(firstName: String,lastName: String){
        this.firstName = firstName
        this.lastName = lastName
    }

}
fun wildSearch(name: String, studentArray: ArrayList<Student>) {

    val searchResults: ArrayList<String> = ArrayList()

    if (name.length < 3){
        logger.info { "String length should be 3 or more" }
    }else{
        for (student in studentArray){
            if(student.firstName.contains(name,ignoreCase = true) ||
                student.lastName.contains(name,ignoreCase = true)){
                searchResults.add(student.fullName())

            }
        }
    }

    logger.info { "Search Results:" }
    for(student in searchResults){
       logger.info { student }
    }

}

fun addNameToList(name: Student, studentArray: ArrayList<Student>){
    var student = name
    studentArray.add(student)
}

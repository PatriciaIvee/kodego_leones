package activity_04_a

/**
 * Covered Topic(s) : Classes
 * Instructions :
 * 1. Use class to represent the student rather string.
 * Make sure the student has a firstName, lastName, nickName, id and year enrolled
 * 2. Update the searchStudentWildSearch to search for the wild string in the
 * lastname, middle name, and firstname. Return
 * the Arraylist of students that match the searched string,
 * if there are no entries return an empty ArrayList.
 * 3. Add a function searchStudentWildSearch that will accept a string
 * and either of the following values, lastname, middle name, nickname.
 * This will search the specific wild string depending on where it was
 * mentioned to be searched for. Return the Arraylist of students that match the searched string,
 * if there are no entries return an empty ArrayList.
 */

class Student{
    var lastName: String = ""
    var firstName: String = ""
    var middleName: String = ""
    var identification: String = ""
    var yearEnrolled: String = ""
}

//fun searchStudentWildSearch(name: String = readln(), studentArrayList: ArrayList<Student> = ArrayList()){
//    val wildSearch = studentArrayList.filter {
//        it.contains(name, ignoreCase = true)
//    }
//    wildSearch.forEach { studentName -> println(studentName) }
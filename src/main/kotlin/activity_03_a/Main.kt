package activity_03_a



import mu.KotlinLogging

private val logger = KotlinLogging.logger{}
/**
 * Covered Topic(s) : Functions
 * Instructions :
 * Note: Names are single word with no spaces example, "Marco", "Eugene"
 * "Sarah", "Isaiah", "Anthony", "Henry".
 *
 * 1. Create an ArrayList of Names with 20 entries.
 *
 * 2. Create a function "isStudentInRecord" that will accept a name and
 * return true if the name is found, otherwise false.
 *
 * 3. Create a function "addStudent" that will accept a name and ass it to the
 * ArrayList.
 *
 * 4. Create a function "removeStudent" that will accept ta name and remove
 * it from the ArrayList.
 *
 * 5. Create a function "countStudent" that will return the size of the ArrayList.
 *
 * 6. Create a function "searchStudentWildSearch" that will accept a String
 *  and search if that string is found with in the ArrayList, it will return an
 * ArrayList of names that matched if there are.
 *
 * 7. Create a function "searchStudentName" that will accept a String and
 * search if there is an exact match of the String input, it will return an ArrayList of names
 * that matched if there are.
 *
 * 8. Create a function "searchStudent" that will accept a String and call "searchStudentWildSearch" if
 * the String input is less than or equal to three, and it will call "searchStudentName"
 * if the String is greater than three.
 *
 * 9.Create a function "showStudents" that will print all the entries in the ArrayList.
 *
 */

fun main(args: Array<String>){

    val names :ArrayList<String> = ArrayList()
    names.add("name1")
    names.add("name2")
    names.add("name3")
    names.add("name4")
    names.add("name5")
    names.add("name6")
    names.add("name7")
    names.add("name8")
    names.add("name9")
    names.add("name10")
    names.add("name11")
    names.add("name12")
    names.add("name13")
    names.add("name14")
    names.add("name15")
    names.add("name16")
    names.add("name17")
    names.add("name18")
    names.add("name19")
    names.add("name20")

    names.forEach { name -> println(name) }
    isStudentInRecord("name1", names)
    addStudent("Joanna", names)
    removeStudent("name20", names)
}


//    isStudentInRecord
fun isStudentInRecord(name:String = String(),studentArrayList: ArrayList<String> = ArrayList()): Boolean {
    if(studentArrayList.contains(name)){
        logger.info { "Name $name is in student record : true" }
        return true
    }
    logger.info {  "Name $name is in student record : false" }
    return false
}

//    addStudent
fun addStudent(name: String = String(), studentArrayList:ArrayList<String> = ArrayList<String>()) {
    studentArrayList.add(name)
    logger.info { studentArrayList }
    }

//    removeStudent
fun removeStudent(name: String = String(), studentArrayList:ArrayList<String> = ArrayList<String>()){
    studentArrayList.remove(name)
    logger.info{studentArrayList}
  }

//    countStudent
fun countStudent(studentArrayList:ArrayList<String> = ArrayList<String>()){
    logger.info { studentArrayList.size }
}

fun searchStudentWildSearch(){}
fun searchStudentName(){}
fun searchStudent(){}
fun showStudents(){}

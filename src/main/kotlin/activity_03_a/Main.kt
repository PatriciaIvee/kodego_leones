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
 * 3. Create a function "addStudent" that will accept a name and add it to the
 * ArrayList.
 *
 * 4. Create a function "removeStudent" that will accept a name and remove
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

fun main(){

    val names :ArrayList<String> = ArrayList()
    names.add("Julio")
    names.add("Eugene")
    names.add("Isaiah")
    names.add("Sarah")
    names.add("Mark")
    names.add("Joseph")
    names.add("Marco")
    names.add("Jeremiah")
    names.add("Ismael")
    names.add("Judith")
    names.add("Ruth")
    names.add("Rico")
    names.add("Hannah")
    names.add("Daniel")
    names.add("Robert")
    names.add("Joanna")
    names.add("Anne")
    names.add("Mary")
    names.add("Mario")
    names.add("Luigi")
    names.add("julio")
    names.add("Julia")
    names.add("julio")
    names.add("juLio")
    names.add("jUlio")


    logger.info{"Enter a name to check of it is in the student record: "}
    isStudentInRecord(studentArrayList =  names)

    logger.info { "Add student onto the record: " }
    addStudent(studentArrayList =  names)

    logger.info {"Remove a student onto the record: " }
    removeStudent(studentArrayList =  names)


    countStudent(studentArrayList = names)

    logger.info { "Wild Search a student: " }
    searchStudentWildSearch(studentArrayList = names)

    logger.info { "Search a student Name: " }
    searchStudentName(studentArrayList = names)

    logger.info { "Search Student:" }
    searchStudent(studentArrayList = names)

    logger.info {"Student names: " }
    showStudents(names)
}


//    isStudentInRecord
fun isStudentInRecord(name:String = readln(), studentArrayList: ArrayList<String> = ArrayList()): Boolean {
    if(studentArrayList.contains(name)){
        logger.info { "Name $name is in student record : true" }
        return true
    }
    logger.info {  "Name $name is in student record : false" }
    return false
}

//    addStudent
fun addStudent(name: String = readln(), studentArrayList:ArrayList<String> = ArrayList()) {
    studentArrayList.add(name)
    logger.info { "$name added in the Student List" }
    }

//    removeStudent
fun removeStudent(name: String = readln(), studentArrayList:ArrayList<String> = ArrayList()){
    if(!studentArrayList.contains(name)){
        logger.info { "$name not in Student List." }
    }else {
        studentArrayList.remove(name)
        logger.info { "$name removed." }
        logger.info { studentArrayList }
    }

  }

//    countStudent
fun countStudent(studentArrayList:ArrayList<String> = ArrayList()){
    logger.info { "names size:${studentArrayList.size}" }
}

fun searchStudentWildSearch(name: String = readln(), studentArrayList: ArrayList<String> = ArrayList()){
    studentArrayList.filter {
        it.contains(name, ignoreCase = true)
    }
    studentArrayList.forEach { studentName -> println(studentName) }
}
fun searchStudentName(name: String = readln(), studentArrayList: ArrayList<String> = ArrayList()){
    val filterArrayList = studentArrayList.filter { it ==  name }
    println(filterArrayList)
}
fun searchStudent(name: String = readln(), studentArrayList: ArrayList<String> = ArrayList()){
    if(name.length <= 3){
        searchStudentWildSearch(name,studentArrayList)
    } else {
        searchStudentName(name,studentArrayList)
    }
}
fun showStudents(studentArrayList: ArrayList<String>){
    studentArrayList.forEach { studentName -> println(studentName) }
}

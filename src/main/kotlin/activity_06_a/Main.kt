package activity_06_a


import mu.KotlinLogging

private val logger = KotlinLogging.logger {  }

/**
 * Using Activity 05 A
 * Create a function that will check the student's grade.
 * The function will accept an array with 10 entries only. It will throw the following exceptions
 * if the array size is greater than 10 throw invalid input
 * if the array contains 0 throw incomplete grades
 */

fun main() {

    var studentGrade: String = "90"
    try {
        checkGrade(studentGrade)
    }catch (e:Exception){
        logger.info { "Catch Error" }
        e.printStackTrace()

    }finally {
        logger.info { "Execute" }
    }

    var gradeArrayList:ArrayList<Float> = ArrayList()

    gradeArrayList.add(90.0F)
    gradeArrayList.add(0.0F)
    gradeArrayList.add(57.0F)
    gradeArrayList.add(76.5F)
    gradeArrayList.add(45.56F)

    gradeArrayList.add(90.0F)
    gradeArrayList.add(0.0F)
    gradeArrayList.add(57.0F)
    gradeArrayList.add(76.5F)
    gradeArrayList.add(45.56F)

//    gradeArrayList.add(80.95F)


    try {
        checkEntryLimit(gradeArrayList)
    }catch(e:Exception){
        logger.info { "Catch Error" }
        e.printStackTrace()
    }finally {
        logger.info { "Execute" }
    }
}

fun isNumeric(checkThis:String): Boolean {

    return checkThis.all{char -> char.isDigit()}

}
fun checkGrade(grade: String){

    if (!isNumeric(grade)){
        throw GradeException("Grade is not numeric")
    }

    if (grade.toFloat() > 100.0F){
        throw GradeNumberException.GradeNumberInput.GradeNumberBeyondLimit()
    }
    if (grade.toFloat() == 0.0F){
        throw GradeNumberException.GradeNumberInput.GradeNumberIsZero()
    }


    if (grade == null){
        throw  GradeException("Student Has no Grade")
    }

}

fun checkEntryLimit( arrayList: ArrayList<Float>){

    if (arrayList.size > 10) {
        throw GradeInputListException.GradeListEntryLimitReached()
    }
    if (arrayList.contains(0.0f)){
        throw GradeInputListException.GradeListEntryIsIncomplete()
    }
}
class GradeException(message:String): Exception(message)

sealed class GradeNumberException(message: String):Exception(message){
    sealed class GradeNumberInput(message: String): GradeNumberException(message){
        class GradeNumberBeyondLimit(message: String = "Grade is Beyond limit 100") : GradeNumberException(message)
        class GradeNumberIsZero(message: String = "Grade is Zero") : GradeNumberException(message)

    }

}

sealed class GradeInputListException(message: String):Exception(message){
    class GradeListEntryLimitReached(message: String = "Grade entry is beyond 10 entries"):GradeInputListException(message)
    class GradeListEntryIsIncomplete(message: String = "Incomplete Grades"):GradeInputListException(message)
}
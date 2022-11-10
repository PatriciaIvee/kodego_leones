package notes

//enum = enumeration
enum class Gender {
    MALE,
    FEMALE
}

enum class Status {
    SINGLE,
    MARRIED,
    DIVORCED,
    WIDOWED,
    UNDEFINED
}
//enum is converted to numerical value but is still readable to people
//enum also applies to ratings and reviews
//Different kinds of classes
//You can put primary constructor to enum class
enum class Planets(var distance:Double){
    MERCURY(10_000_000.00),
    VENUS(20_000_000.00),
    EARTH(30_000_000.00); //add semicolon to end it

    init{

    }
//    secondary constructor
    constructor():this(0.00)
//    you can also add method
    fun changeDistance(distance: Double){
        this.distance = distance
    }
}

data class StudentInformation(var id:String){
//it will always have a primary constructor unlike in a class it is optional
//    used for processing data
//    if you're manipulating and comparing high data , you use this

}
open class Animal{

}

abstract class Classroom{
    abstract fun createClassroom()
    fun closeClassroom(){

    }
//the difference off abstract to interface is
}

interface Template{
    fun createTemplate()
    fun executeTemplate()

// interface is a special it is a template
//    usually only has method names / function names
}

sealed class Forms{

}

class School{
//    inner class within class
    class Classroom{

        class Facility{

        }
    }
}

fun addClassroom(){
    class  InitializerClass(){

    }
}

object SessionManager{
//once instance only
}

//value class Information(private val s:String){
//
//}

fun main() {
    var status = Status.UNDEFINED
    if(status == Status.MARRIED) {
        println("Status is Married")
    }
    var maritalStatus = arrayOf("single", "married", "divorced","widowed", "undefined")
//    the problem with using array is it is slower. Comparing Strings is or takes longer for computer
    var maritalStatusAnswer = ""
    if( maritalStatusAnswer == maritalStatus[0]){
//        ???? not as readable compared to using enum class
    }


}
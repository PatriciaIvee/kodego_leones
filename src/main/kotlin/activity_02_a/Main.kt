package activity_02_a

import java.sql.Time
import java.time.Year
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    /**
     * Implement Activity 01 - A using data structure
     *
     */

    //    log in details for School Library Directory
    var logInSchoolDirectory : Map<String, String> = mutableMapOf()
    var libraryCard = ArrayList<String>()

    //People involved in the directory
    val schoolDirectory : String // just the name of the directory
    var studentNumbers :Set<String> = HashSet<String>()
    var instructor = ArrayList <String>()
    var instructorAssistant = ArrayList <String>()

    //Student or instructor information
    var lastNames = ArrayList <String>()
    var firstName = ArrayList <String>()
    var middleName = ArrayList <String>()
    var suffix = ArrayList <Any?>()
    var birthDates = ArrayList <Date>()
    var ages = ArrayList <IntRange>()
    var gender = ArrayList <String>()
    var address = ArrayList <String>()
    var city = ArrayList <String>()
    var province = ArrayList <String>()
    var zipCode = ArrayList <Int>()
    var landlineNumber = ArrayList <String?>()
    var cellPhones = ArrayList <String?>()
    var emails = ArrayList <String?>()
    var departments: List <String> = ArrayList <String>()

    //Details about your course and class
    var classStart = ArrayList <Date>()
    var classEnd = ArrayList <Date>()
    val classDetails : Map<String, String> = mutableMapOf() //topic(K) and info(V)
    var classBatch : List <String> = ArrayList <String>()
    var course : List <String> = ArrayList <String>()
    var subject : List <String> = ArrayList <String>()
    var classSchedule : Map<String, String> = mutableMapOf()
    var roomNumber : List <Int?> = ArrayList <Int?>()
    var timeIn = ArrayList <Time>()
    var timeOut = ArrayList <Time>()
    var classDuration = ArrayList <Time>()
    var tuitionStatus : List <String> = ArrayList <String>()

    //Information to complete and pass the course, materials, announcements etc.
    val classInformation = ArrayList<String>()
    var announcements = ArrayList <String?>()
    var modules = ArrayList <String?>()
    var exercises = ArrayList <String?>()
    var assignments  = ArrayList <String?>()
    var quizzes  = ArrayList <String?>()
    var projects  = ArrayList <String?>()
    var recordings  = ArrayList <String?>()
    var grades  = ArrayList <String?>()
    var scores  = ArrayList <Int?>()
    var events  = ArrayList <String?>()
    var dueDates  = ArrayList <Date?>()


}
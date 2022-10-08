package activity_01_a

import java.sql.Time
import java.time.Year
import java.time.format.DateTimeFormatter
import java.util.Date

fun main() {
    //dateFormat
    val dateFormat =  DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm")

    //People involved in the directory
    val schoolDirectory : String
    var student : String
    var instructor : String
    var instructorAssistant : String

    //Student or instructor information
    var lastName : String
    var firstName : String
    var middleName : String
    var suffix : Any?
    var birthDate = Date()
    var age = 0 .. 100
    var gender : String
    var address: String
    var city : String
    var province : String
    var zipCode : Int
    var landlineNumber : Int?
    var cellPhone: Long?
    var email : String?
    var department : String?

    //Details about your course and class
    var classStart : Date
    var classEnd : Date
    val classDetails : String
    var classBatch : String?
    var course : String?
    var subject : String?
    var classSchedule : String
    var roomNumber : Int
    var roomName : String
    var timeIn : Time
    var timeOut : Time
    var classDuration : Time
    var absent : Boolean
    var late : Boolean
    var year : Year
    var paid : Boolean
    var tuitionStatus : String

    //Information to complete and pass the course, materials, announcements etc.
    val classInformation : String
    var announcements: String?
    var module: String?
    var exercise : String?
    var assignment : String?
    var quiz : String?
    var project : String?
    var recording : String?
    var grade : Boolean
    var score : Int?
    var completed : Boolean
    var totalModules : Int
    var totalExercises : Int
    var totalAssignments : Int
    var totalQuizzes : Int
    var totalProjects : Int
    var totalRecordings : Int
    var totalScore : Int
    var event : String
    var dueDate : Date
}